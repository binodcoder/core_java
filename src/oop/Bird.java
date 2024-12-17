package oop;
public class Bird {
    String colour;
    String family;
    float length;

    // Constructor with 'family' parameter
    Bird(String family){
        this.family=family;
    }

   //important: why can't I make constructor that assign colour properties of the bird?

    // Constructor with 'colour' and 'family' parameters
    Bird(String colour, String family, float length){
        this.colour=colour;
        this.family=family;
        this.length=length;
    }

    // Constructor with 'colour' and 'length' parameters
    Bird(String colour, float length){
        this.colour=colour;
        this.length=length;
    }

    // Constructor with 'length' and 'family' parameters
    Bird(float length, String family){
        this.length=length;
        this.family=family;
    }

    // Constructor with 'length' parameter
    Bird(float length){
        this.length=length;
    }
}
