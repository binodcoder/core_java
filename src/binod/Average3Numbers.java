package binod;
import java.util.Scanner;
public class Average3Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input First Number:");
        int firstNumber=scanner.nextInt();
        System.out.println("Input Second Number:");
        int secondNumber=scanner.nextInt();
        System.out.println("Input Third Number:");
        int thirdNumber=scanner.nextInt();

        int average=(firstNumber+secondNumber+thirdNumber)/3;
        System.out.println("The average of three numbers is: "+average);
    }
}
