package day38_abstraction_interface.shopping;

public interface ConsumerApp extends AllowUserToSell, Shipping {
    //We're using extends when we are inheriting two interfaces as well
}
abstract class TestA implements AllowUserToSell, Shipping {
    //We're using implements because TestA is a class
}