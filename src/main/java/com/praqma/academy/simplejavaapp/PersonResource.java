package com.praqma.academy.simplejavaapp;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("persons")
public class PersonResource {

    @Inject
    PersonDatabase database;

    @GET
    @Produces("application/xml")
    public Person[] get() {
        return database.currentList();
    }
   
    @GET
    @Path("put/{isbn}")
    public void addPerson(@PathParam("isbn") String id){
        database.addPerson(new Person(id));
    }
    
    @GET
    @Path("{id}")
    @Produces("application/xml")
    public Person get(@PathParam("id") int id) {
        return database.getPerson(id);
    }
}
