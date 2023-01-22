package api.payloads;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IncidentPayload {
    
    private int id;
    private String date;
    private String name;
    private String subject;
    private String descripcion;

    public String getDate() {
        return date;
    }
    public void setDate(Date date) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        this.date = formatDate.format(date);
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

}
