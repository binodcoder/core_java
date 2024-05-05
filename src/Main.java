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
<<<<<<< HEAD
    Shape(String colour, double area) {
        this.colour = colour;
        this.area = area;
    }
=======

    Shape(double area){
        this.area=area;
    }

>>>>>>> 6a69c2f26198bd230a5a8aa01188f299f6834402
    Shape(Shape s1) {
        this.colour = s1.colour;
        this.area = s1.area;
    }
<<<<<<< HEAD
    void findArea() {
=======

    void findArea() {

>>>>>>> 6a69c2f26198bd230a5a8aa01188f299f6834402
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
    }
}
//primitives data types
//int, double, String, float, long , short, byte, boolean
//wrapper classes
//Int, Double, String, Float, Long,