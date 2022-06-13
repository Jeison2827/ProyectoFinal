package co.edu.unbosque.proyectofinal.dtos;



public class UserApp {

    private String username;

    private String email;

    private String password;


    private String role;



    public UserApp(String username, String email, String password, String role) {
        this.username = username;
        this.email= email;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
