package day40_exception;

public class TryWithInheritance {
    public static void main(String[] args) {
        try {

        } catch (IndexOutOfBoundsException e) {

        } catch (RuntimeException e) {

        } catch (Exception e) {

        }
        IndexOutOfBoundsException e = new IndexOutOfBoundsException();
        RuntimeException e2 = new IndexOutOfBoundsException();
        Exception e3 = new IndexOutOfBoundsException();
    }
}