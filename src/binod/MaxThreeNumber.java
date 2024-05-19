package binod;
import java.util.Scanner;
public class MaxThreeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Input second number");
        int secondNumber=scanner.nextInt();
        System.out.println("Input third number");
        int thirdNumber=scanner.nextInt();

        if(firstNumber>secondNumber){
            if(firstNumber>thirdNumber){
                System.out.println(firstNumber);
            }else{
                System.out.println(thirdNumber);
            }

        }else{
            if(secondNumber>thirdNumber){
                System.out.println(secondNumber);
            }else{
                System.out.println(thirdNumber);
            }
        }
    }
}
