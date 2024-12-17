package binod;
import java.util.Scanner;
//question 1: 2 times

class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumofodd = 0;
        int sumofeven = 0;
        Boolean permission = true;
        do {
            System.out.println("Enter an number");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sumofeven += n;
            } else {
                sumofodd += n;
            }
            System.out.println("Do you wanna continue ? true/false");
            permission = sc.nextBoolean();
        } while (permission ==  true);
        System.out.println("Sum of Even =" + sumofeven);
        System.out.println("Sum of Odd=" + sumofodd);
    }
}

public class LoopsQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int f = n;
        for (int i = 1; i < n; i++) {
            f = f * (n - i);
        }
        System.out.println(f);
    }
}

class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
