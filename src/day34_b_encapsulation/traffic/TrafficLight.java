package day34_b_encapsulation.traffic;

public class TrafficLight {
    private String color;
    public TrafficLight(String color) {
        this.color = color;
    }
    public String getColor() {      //READ (VIEW) ONLY access, because we can't change a value outside of class
        return color;
    }
    public void setColor(String color) {        //WRITE ONLY access, without getColor() we can't use variable anywhere
        if (color.equals("red") || color.equals("yellow") || color.equals("green")) {
            this.color = color;
        }
    }
}