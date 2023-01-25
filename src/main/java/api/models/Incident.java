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

    private int id;
    private String name;

    MysqlConnexion repository = new MysqlConnexion();;
    String table = "incidences";

    public Incident() {
    }

    public Incident(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
                incident.setId(rs.getInt("id_incidence"));
                incident.setName(rs.getString("name"));
                incident.setSubject(rs.getString("subject"));
                incident.setDescripcion(rs.getString("descripcion"));
                incident.setDate(rs.getDate("date"));;
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
        preparedStatement.setString(1, incident.getDate());
        preparedStatement.setString(2, incident.getName());
        preparedStatement.setString(3, incident.getSubject());
        preparedStatement.setString(4, incident.getDescripcion());
        preparedStatement.executeUpdate();
        preparedStatement.close();

        Statement statement = repository.conn.createStatement();
        String sql = String.format("SELECT * FROM %s ORDER BY id_incidence DESC LIMIT 1", table);
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            incident.setId(rs.getInt("id_incidence"));
            incident.setName(rs.getString("name"));
        }
        
        return incident;
    }

    public IncidentPayload updating(IncidentPayload incident) throws SQLException {

        String sql_insert = "UPDATE incidences SET date=?, name=?, subject=?, descripcion=? WHERE id_incidence=?";
        PreparedStatement preparedStatement = repository.conn.prepareStatement(sql_insert);
        preparedStatement.setString(1, incident.getDate());
        preparedStatement.setString(2, incident.getName());
        preparedStatement.setString(3, incident.getSubject());
        preparedStatement.setString(4, incident.getDescripcion());
        preparedStatement.setInt(5, incident.getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();

        Statement statement = repository.conn.createStatement();
        String sql = String.format("SELECT * FROM %s WHERE id_incidence=%d ORDER BY id_incidence DESC LIMIT 1", table, incident.getId());
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            incident.setId(rs.getInt("id_incidence"));
            incident.setName(rs.getString("name"));
        }
        
        return incident;
    }

    public IncidentPayload deleting(IncidentPayload incident) throws SQLException {

        String sql_insert = "DELETE FROM incidences WHERE id_incidence=?";
        PreparedStatement preparedStatement = repository.conn.prepareStatement(sql_insert);
        preparedStatement.setInt(1, incident.getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();

        incident.setId(incident.getId());
        incident.setName("Delete");
        
        return incident;
    }
}
