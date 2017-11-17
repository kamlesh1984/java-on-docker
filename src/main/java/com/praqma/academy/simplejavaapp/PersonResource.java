package com.praqma.academy.simplejavaapp;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("persons")
public class PersonResource {

    @Inject
    PersonDatabase database;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person[] get() {
        return database.currentList();
    }
   
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putPerson(Person person){
    database.addPerson(person);
    }
    
    @GET
    @Path("put/{isbn}")
    public void addPerson(@PathParam("isbn") String id){
        database.addPerson(new Person(id));
    }
    
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person get(@PathParam("id") int id) {
        return database.getPerson(id);
    }
}
