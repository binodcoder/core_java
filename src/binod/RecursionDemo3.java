package binod;
public class RecursionDemo3 {
    //Q. print sum of first n natural numbers
    public static void main(String[] args) {
        printNumbers( 5,0);
    }
    public static void printNumbers(  int n, int sum  ) {
        if ( n==0) {
            System.out.println(sum);
            return;
        }
        sum+=n;
        printNumbers(  n-1, sum);
        //control down flow, clearing memory
        System.out.println(n);
    }
}
