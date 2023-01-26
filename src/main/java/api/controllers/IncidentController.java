package api.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import api.contracts.InterfaceService;
import api.models.Message;
import api.services.IncidentService;
import api.views.View;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/api/incidents")
public class IncidentController extends HttpServlet {

    private InterfaceService incidentService;

    public IncidentController() {
        this.incidentService = new IncidentService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=utf-8");

        PrintWriter out = resp.getWriter();

        try {
            List<Object> incidents = incidentService.index();
            out.println(View.show(incidents));
            resp.setStatus(HttpServletResponse.SC_OK);
            out.close();
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            Message message = new Message();
            message.setMessage("Error en el traspaso de datos: " + e.getMessage());
            out.println(View.show(message));
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=utf-8");
        PrintWriter out = resp.getWriter();

        try {
            Object incident = incidentService.store(req.getReader());
            out.println(View.show(incident));
            resp.setStatus(HttpServletResponse.SC_CREATED);
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            System.out.println("Error: " + e.getMessage());
        }

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=utf-8");
        PrintWriter out = resp.getWriter();

        try {
            
            Object incident = incidentService.update(req.getReader());
            out.println(View.show(incident));
            resp.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=utf-8");
        PrintWriter out = resp.getWriter();

        try {
            
            Object incident = incidentService.delete(req.getReader());
            out.println(View.show(incident));
            resp.setStatus(HttpServletResponse.SC_OK);
        } catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            System.out.println("Error: " + e.getMessage());
        }
    }
}
