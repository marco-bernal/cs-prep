package com.mab.cs_prep.mocks.example.model;

//ToDO: Uncomment code for adding validations
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotBlank;

public class User {

    //@NotBlank(message = "Name cannot be null nor whitespace")
    private String name;

//    @Min(value = 18, message = "Age should not be less than 18")
//    @Max(value = 150, message = "Age should not be greater than 150")
    private Integer age;

    private Address address;

    public User() {
    }

    public User(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", age = " + age +
                ", address = " + address;
    }
}
