package Wiley_Edge_Client_Interview_Questions.Morgan_Stanley.SingletonClass;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Public static method to get the single instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method of the singleton class
    public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }
}
