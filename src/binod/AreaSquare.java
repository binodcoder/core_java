package binod;
import java.util.Scanner;
public class AreaSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter side of a square");
        double side=scanner.nextDouble();
        double area=side*side;
        System.out.println("The area of square is: "+area);
    }
}
