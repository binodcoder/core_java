package binod;
import java.util.Scanner;
public class SumTwoNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber=scanner.nextInt();
        int sum=firstNumber+secondNumber;
        System.out.println(sum);

    }
}
