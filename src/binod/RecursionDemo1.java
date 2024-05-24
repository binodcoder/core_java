package binod;
public class RecursionDemo1 {
    //print numbers from 5 to 1
    public static void main(String[] args) {
        printNumber(5);

    }
    //Q.Why do we make static method
   public static void printNumber(int n){
        //base condition
        if(n==0){
            return;
        }
       System.out.println(n);
       printNumber(n-1);
    }
}
