package com.mab.mocks.qualified.example.model;

// TODO: Add address validations
public class Address {
    private Integer number;
    private String street;
    private String city;
    private String state;

    public Address() {
    }

    public Address(Integer number, String street, String city, String state) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public Integer getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "number = " + number +
                ", street = " + street +
                ", city = " + city +
                ", state = " + state;
    }
}
