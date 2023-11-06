package day30_b_custom_classes;

public class UsingApp {
    public static void main(String[] args) {
        App app1 = new App();
        app1.name = "Etsy";
        app1.version = 5.7;
        app1.isFree = true;
        System.out.println(app1);       //it'll print the memory location of object
        app1.run();
        System.out.println("Version: " + app1.version);
        app1.update();
        System.out.println("Version: " + app1.version);
        new App().run();        //making new object and calling run method
    }
}