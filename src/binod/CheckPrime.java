package binod;
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        int flag=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input some number");
        int inputNumber=scanner.nextInt();
        for (int i=2;i<inputNumber;i++){
            if(inputNumber%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("prime");

        }else{
            System.out.println("not prime");
        }
    }
}
