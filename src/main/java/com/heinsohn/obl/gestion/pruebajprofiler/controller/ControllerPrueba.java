package com.heinsohn.obl.gestion.pruebajprofiler.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.heinsohn.obl.gestion.pruebajprofiler.dto.DtoPrueba1;
import com.heinsohn.obl.gestion.pruebajprofiler.services.ThreadsService;

@Path("/helloPrueba")
public class ControllerPrueba {
    
    private List<String> items = new ArrayList<>();

    @Inject
    ThreadsService threadsService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public DtoPrueba1 hello() {
        DtoPrueba1 pr1 = new DtoPrueba1();
        pr1.setNombre("adrian burbano");
        return pr1;
    }

    @POST
    @Path("/add")
    @Consumes(MediaType.TEXT_PLAIN)
    public void addItem(String item) {
        items.add(item);
    }

    @GET
    @Path("/items")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    @GET
    @Path("/slow")
    @Produces(MediaType.TEXT_PLAIN)
    public String slowEndpoint() {
        try {
            Thread.sleep(5000); // Simulate a slow process
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "This was slow!";
    }

    @GET
    @Path("/thread")
    @Produces(MediaType.TEXT_PLAIN)
    public String checkThreads() {
        threadsService.startThreads();
        return "Threads are running. Check JProfiler for details.";
    }

}
