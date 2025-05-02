package binod.arrays;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        int[] marks =new int[50];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("math "+ marks[0]);
        System.out.println("eng "+ marks[1]);
        System.out.println("science "+ marks[2]);

    }
}
