package day33_b_encapsulation.login;

public class UsingLogin {
    public static void main(String[] args) {
        Login obj = new Login();
        //obj.username = "ahmad.m77";
        //System.out.println(obj.username);
        //obj.password = "LoopCamp2023";
        //System.out.println(obj.password);
        obj.setUsername("ahmad.m77");
        obj.setPassword("LoopCamp2023");
        System.out.println("Username: " + obj.getUsername());
        System.out.println("Password: " + obj.getPassword());
    }
}