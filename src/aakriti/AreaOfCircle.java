package aakriti;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {

        double pi=3.14;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input radius of circle");
        double r= scanner.nextDouble();
        double area=pi*r*r;
        System.out.println("The area of circle is: "+area);
    }




}
