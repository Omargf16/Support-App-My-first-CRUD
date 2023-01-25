package api.services;

import java.io.BufferedReader;
import java.util.List;

import com.google.gson.Gson;

import api.contracts.InterfaceService;
import api.models.Incident;
import api.payloads.IncidentPayload;

public class IncidentService implements InterfaceService {
    
    private Incident incident;
    private Gson gson;

    public IncidentService() {
        this.incident = new Incident();
        this.gson = new Gson();
    }

    public List<Object> index() {
        return incident.index();
    }

    @Override
    public Object store(BufferedReader body) {

        try {
            IncidentPayload incidentPayload = gson.fromJson(body, IncidentPayload.class);
            IncidentPayload incidentAdded = incident.save(incidentPayload);
            return incidentAdded;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

    }

    @Override
    public Object update(BufferedReader body) {

        try {
            IncidentPayload incidentPayload = gson.fromJson(body, IncidentPayload.class);
            IncidentPayload incidentUpdated = incident.updating(incidentPayload);
            return incidentUpdated;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

    }

    @Override
    public Object delete(BufferedReader body) {

        try {
            IncidentPayload incidentPayload = gson.fromJson(body, IncidentPayload.class);
            IncidentPayload incidentUpdated = incident.deleting(incidentPayload);
            return incidentUpdated;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }

    }
}