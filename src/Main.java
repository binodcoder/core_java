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

  //copy constructor example below:
    Shape(Shape s1) {
        this.colour = s1.colour;
        this.area = s1.area;
    }

    void findArea() {

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

        Animal a1=new Animal("dog", 46, "medium");

        System.out.println(a1.name);


        Animal a2=new Animal();
        System.out.println("please enter your animal name");
        a2.name="cat";
        a2.weight=23;
        a2.size="small";

        Animal a3=new Animal(a2);
        System.out.println(a3.weight);

       Bird b1= new Bird("parrot","huge", 26);
        System.out.println(b1.colour);
        System.out.println(b1.family);
        System.out.println(b1.length);

        Furniture f1= new Furniture("Bed", 18);
        System.out.println(f1.name);
        System.out.println(f1.breadth);

    }


}
//primitives data types
//int, double, String, float, long , short, byte, boolean
//wrapper classes
//Int, Double, String, Float, Long,