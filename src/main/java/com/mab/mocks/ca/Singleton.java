package com.mab.mocks.ca;

//TODO: Explain key points to create a Singleton class. Add tests.
public class Singleton {
    private static final Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
