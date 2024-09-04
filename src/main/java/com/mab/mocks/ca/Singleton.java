package com.mab.mocks.ca;

/**
 * A Singleton class is used whenever only one instance has to be created.
 * And reused by other classes. if we try to instantiate the Java Singleton classes, the new variable
 * also points to the first instance created. So whatever modifications we do to any variable inside the class
 * through any instance, affects the variable of the single instance created.
 * Usages: DB connection class, Socket connection class.
 *
 * To make one, must match the following conditions:
 * Have a private static final field.
 * Have a private constructor.
 * Have a static method that returns the Singleton instance.
 */
public class Singleton {

    //private static final field
    private static final Singleton ourInstance = new Singleton();

    //private constructor.
    private Singleton() {
    }

    //static method that returns the Singleton class type.
    public static Singleton getInstance() {
        return ourInstance;
    }
}
