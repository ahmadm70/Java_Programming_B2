package day38_abstraction_interface.create;

public interface Create {
    public abstract void read();
    /*
    In interface if we've method with return type and name
    These methods by default will be "public abstract"
     */
    void write();
    //This method is: public abstract void write();
}