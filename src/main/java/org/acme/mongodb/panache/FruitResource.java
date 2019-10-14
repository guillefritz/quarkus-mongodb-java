package org.acme.mongodb.panache;

import org.acme.mongodb.panache.model.Fruit;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/fruits")
public class FruitResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruit> findAll() {
        return Fruit.listAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void create(Fruit fruit) {
        fruit.persist();
    }
}