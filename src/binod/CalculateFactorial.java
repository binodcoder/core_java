package binod;
public class CalculateFactorial {
    public static void main(String[] args) {
        int fac=calcFactorial(5);
        System.out.println(fac);
    }
    public static int calcFactorial(int n){
        if(n==1||n==0){
            return 1;
        }
        return n*calcFactorial(n-1);
    }
}
