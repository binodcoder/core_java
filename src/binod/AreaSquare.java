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

    public static void swap(int a, int b) {
        //swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public static int findProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int findFactorial(int n){
        int fact=1;

        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side of a square");
        double side = scanner.nextDouble();
        printHelloWorld();
        double area = calculateSquare(side);
        System.out.println("The area of square is: " + area);
        swap(1, 2);
        System.out.println(findProduct(2, 3));
        System.out.println(findFactorial(3));
    }
}
