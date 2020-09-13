package DesignPatterns.Creational;
/*This implementation is thread safe
When the singleton class is loaded, inner class is not loaded and hence doesn’t create object when loading the class.
Inner class is created only when getInstance() method is called. So it may seem like eager initialization but it is lazy initialization.
This is the most widely used approach as it doesn’t use synchronization.*/

/*lazy initialization is the tactic of delaying the creation of an object, the calculation of a value,
 or some other expensive process until the first time it is needed.
  It is a kind of lazy evaluation that refers specifically to the instantiation of objects or other resources.*/
/*doubled checked locking is two-time check whether instances is initialized or not, first without locking and second with locking*/
public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
