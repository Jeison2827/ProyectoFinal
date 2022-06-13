package co.edu.unbosque.proyectofinal.resources;


import jakarta.servlet.ServletContext;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;

@Path("/wallet")
public class WalletResource {
    @Context
    ServletContext context;
    static final String JDBC_DRIVER = "org.postgresql.Driver";
    static final String DB_URL = "jdbc:postgresql://localhost/TallerCinco";

    static final String USER = "postgres";
    static final String PASS= "123456";
}
