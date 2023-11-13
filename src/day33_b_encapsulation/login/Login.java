package day33_b_encapsulation.login;

public class Login {
    //String username;
    private String username;
    //String password;
    private String password;
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}