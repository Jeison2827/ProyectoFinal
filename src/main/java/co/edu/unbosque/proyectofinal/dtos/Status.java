package co.edu.unbosque.proyectofinal.dtos;

public class Status {

    private int status;
    private  String message;

    public Status(int status, String message) {
        this.status = status;
        this.message = message;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

