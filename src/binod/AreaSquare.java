package binod;
import java.util.Scanner;

public class AreaSquare {
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static double calculateSquare(double side) {
        double area = side * side;
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of a square");
        double side = scanner.nextDouble();
        printHelloWorld();
        double area = calculateSquare(side);
        System.out.println("The area of square is: " + area);
    }
}
