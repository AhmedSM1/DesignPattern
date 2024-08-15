package creational.singleton;

public class SingletonObj {
    // Step 1: Create a private static variable to hold the single instance of the class.
    private static SingletonObj instance;

    // Step 2: Make the constructor private to prevent instantiation from other classes.
    private SingletonObj() {
        // Private constructor to prevent instantiation
    }

    // Step 3: Provide a public static method to get the instance of the class.
    public static SingletonObj getInstance() {
        if (instance == null) {
            instance = new SingletonObj(); // Lazy initialization
        }
        return instance;
    }

    // Example method in Singleton class
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
