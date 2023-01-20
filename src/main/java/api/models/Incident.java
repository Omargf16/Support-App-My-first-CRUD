package api.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import api.payloads.IncidentPayload;
import api.repositories.mysql.MysqlConnexion;

public class Incident {

    private Long id;
    private String name;

    MysqlConnexion repository = new MysqlConnexion();;
    String table = "incidences";

    public Incident() {
    }

    public Incident(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Incident [id=" + id + ", name=" + name + "]";
    }

    public List<Object> index() {

        try {
            Statement statement = repository.conn.createStatement();
            String sql = String.format("SELECT * FROM %s", table);
            ResultSet rs = statement.executeQuery(sql);

            List<Object> incidents = new ArrayList<>();

            while (rs.next()) {
                IncidentPayload incident = new IncidentPayload();
                incident.setId(rs.getLong("id_incidence"));
                incident.setName(rs.getString("name"));
                incidents.add(incident);
            }

            return incidents;

        } catch (Exception ex) {
            System.out.println("SQL Exception: " + ex.getMessage());
            return null;
        }

    }

    public IncidentPayload save(IncidentPayload incident) throws SQLException {

        String sql_insert = "INSERT INTO incidences (date, name, subject, descripcion) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = repository.conn.prepareStatement(sql_insert);
        preparedStatement.setString(1, "2023-01-20");
        preparedStatement.setString(2, incident.getName());
        preparedStatement.setString(3, "probando post");
        preparedStatement.setString(4, "si lees esto es que funciona");
        preparedStatement.executeUpdate();
        preparedStatement.close();

        Statement statement = repository.conn.createStatement();
        String sql = String.format("SELECT * FROM %s ORDER BY id_incidence DESC LIMIT 1", table);
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            incident.setId(rs.getLong("id_incidence"));
            incident.setName(rs.getString("name"));
        }
        
        return incident;
    }
}
