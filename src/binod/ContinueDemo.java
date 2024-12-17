package binod;
import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}

class ContinueDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter any number");
            int n = sc.nextInt();
            if (n % 10==0) {
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}
