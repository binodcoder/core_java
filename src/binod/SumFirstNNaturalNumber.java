package binod;
import java.util.Scanner;
public class SumFirstNNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Some number");
        int inputNumber=scanner.nextInt();
        int sum=0;

        for(int i=1;i<inputNumber;i++){
            sum=sum+i;


        }
        System.out.println(sum);

    }
}
