package oop;
public class Animal {
    String name;
    float weight;
    String size;

    //a constructor is an especial method that execute at the beginning when object of class is created.

    //no parameterized
    Animal() {

    }

    //parameterized
    Animal(String name, float weight, String size) {
        this.name = name;
        this.weight = weight;
        this.size = size;
    }

    Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    Animal(String name) {
        this.name = name;
    }

    Animal(String size, String name) {
        this.size = size;
        this.name = name;
    }

    //copy constructor
    Animal(Animal animal) {
        this.name = animal.name;
        this.weight = animal.weight;
        this.size = animal.size;
    }
}

