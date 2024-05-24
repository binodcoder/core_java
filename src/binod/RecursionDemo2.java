package binod;
public class RecursionDemo2 {
    //Q. Print numbers from 1 to 5
    public static void main(String[] args) {
        printNumber(1);
    }
    public static void printNumber(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        printNumber(n + 1);
    }
}
