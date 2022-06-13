package co.edu.unbosque.proyectofinal.dtos;

public class Fcoins {public class Colecciones {
    private String email;
    private String username;
    private String coleccion;

    public Colecciones() {

    }

    public Colecciones(String email, String username, String coleccion) {
        this.email = email;
        this.username = username;
        this.coleccion = coleccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", coleccion='" + coleccion + '\'' +
                '}';
    }
}
}
