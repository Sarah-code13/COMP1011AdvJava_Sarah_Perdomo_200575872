package com.example.comp1011spring2025thursdays5pm;

public class CameraModel {

    /*
        lens: String
        color: String
        iso: double
        make: from a list of options
        model: String
        int resolution

     */
    private String lens;
    private String color;
    private double iso;
    private int resolution;
    private String model;
    enum Companies {SONY, NIKON, CANON, FUJIFILM}
    private Companies make = Companies.SONY;

    /*
        Create the getters and setters for each instance variable
        For all instance variables except make, add restrictions
            throw an IllegalArgumentException if the value is not valid
        Create 2 constructors: default + 6-arg constructor
        Bonus: create a method named: getAllCompanies -> returns a list of all companies as String data type

     */

}
