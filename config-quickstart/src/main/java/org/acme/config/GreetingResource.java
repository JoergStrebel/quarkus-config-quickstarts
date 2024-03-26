package org.acme.config;

import java.util.Optional;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/greeting")
public class GreetingResource {

    @Inject
    Country myConfigs;

    @ConfigProperty(name = "greeting.message")
    String message;

    @ConfigProperty(name = "greeting.suffix", defaultValue = "!")
    String suffix;

    @ConfigProperty(name = "greeting.name")
    Optional<String> name;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        System.out.println("No. of elements: "+ myConfigs.country().size());
        return message + " " + name.orElse("world") + suffix;
    }
}
