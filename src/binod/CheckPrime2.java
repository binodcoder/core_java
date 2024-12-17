package binod;
import java.util.Scanner;

public class CheckPrime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean flag = true;
        if (n == 2) {
            System.out.println("prime");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("  prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}
