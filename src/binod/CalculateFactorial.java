package binod;
public class CalculateFactorial {
    public static void main(String[] args) {
        System.out.println(calcFactorial(5));
    }
    public static int calcFactorial(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*calcFactorial(n-1);
    }
}
