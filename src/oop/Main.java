package oop;
class Shape {
    String colour;
    double area;

    Shape(String colour) {

        this.colour = colour;
    }

    Shape(String colour, double area) {
        this.colour = colour;
        this.area = area;
    }



    Shape(double area) {
        this.area = area;
    }

    Shape(Shape s1) {
        this.colour = s1.colour;
        this.area = s1.area;
    }

}

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Shape("red", 2.3);
        Shape s2 = new Shape(s1);
        System.out.println("properties of s1");
        System.out.println(s1.colour);
        System.out.println(s1.area);
        System.out.println("\n");
        System.out.println("properties of s2");
        System.out.println(s2.colour);
        System.out.println(s2.area);

        Animal a1 = new Animal("dog", 46, "medium");

        System.out.println(a1.name);


        Animal a2 = new Animal();
        System.out.println("please enter your animal name");
        a2.name = "cat";
        a2.weight = 23;
        a2.size = "small";

        Animal a3 = new Animal(a2);
        System.out.println(a3.weight);

        Bird b1 = new Bird("parrot", "huge", 26);
        System.out.println(b1.colour);
        System.out.println(b1.family);
        System.out.println(b1.length);

        Furniture f1 = new Furniture("Bed", 18);
        System.out.println(f1.name);
        System.out.println(f1.breadth);

        System.out.println("This is h1 house");
        House h1 = new House("Aakritiko oop.House", 4, 2);
        System.out.println(h1.name);
        System.out.println(h1.bedrooms);
        System.out.println(h1.toilets);
        h1.changingBedsheet();
        h1.cleaningBathroom();

        System.out.println("This is h2 house");
        House h2 = new House(h1);
        System.out.println(h2.name);
        System.out.println(h2.bedrooms);
        System.out.println(h2.toilets);
        System.out.println("This is h3 house");
        House h3 = new House(h2);
        System.out.println(h3.name);
        System.out.println(h3.toilets);
        System.out.println(h3.bedrooms);


      Vehicle v1=  new Vehicle("car",12600, "fifteen years old","four seats");
        System.out.println(v1.name);
    }
}

//primitives data types
//int, double, String, float, long , short, byte, boolean
//wrapper classes
//Int, Double, String, Float, Long,