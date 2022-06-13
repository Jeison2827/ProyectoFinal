package co.edu.unbosque.proyectofinal.dtos;

public class Obra {

    private int id_obra;
    private int id_artista;
    private double precio;
    private String titulo;

    public Obra(int id_obra, int id_artista, double precio, String titulo) {
        this.id_obra = id_obra;
        this.id_artista = id_artista;
        this.precio = precio;
        this.titulo = titulo;
    }

    public int getId_obra() {

        return id_obra;
    }

    public void setId_obra(int id_obra) {

        this.id_obra = id_obra;
    }

    public int getId_artista() {

        return id_artista;
    }

    public void setId_artista(int id_artista) {

        this.id_artista = id_artista;
    }

    public double getPrecio() {

        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }


    @Override
    public String toString() {
        return "Obra{" +
                "id_obra=" + id_obra +
                ", id_artista=" + id_artista +
                ", precio=" + precio +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
