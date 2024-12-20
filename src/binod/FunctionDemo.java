package binod;
public class FunctionDemo {
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static double calculateSquare(double side) {
        double area = side * side;
        return area;
    }

    public static void swap(int a, int b) {
        //swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public static int findProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int findFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double findBinomialCoefficient(int n, int r) {
        double nfac = findFactorial(n);
        double rfac = findFactorial(r);
        double nrfac = findFactorial(n - 1);
        double bc = nfac / (rfac * nrfac);
        return bc;
    }

    public static boolean isPrime(int n) {
        //1 is neither composite nor prime
        //checking for 2
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int range) {
        for (int i = 2; i <= range; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static void binToDec(int binNum) {
        int power = 0;
        int dnum = 0;
        while (binNum > 0) {
            int ld = binNum % 10;
            dnum = dnum + (ld * (int) Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }
        System.out.println(dnum);
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter side of a square");
//        double side = scanner.nextDouble();
//        printHelloWorld();
//        double area = calculateSquare(side);
//        System.out.println("The area of square is: " + area);
//        swap(1, 2);
//        System.out.println(findProduct(2, 3));
//        System.out.println(findFactorial(3));
//        System.out.println(findBinomialCoefficient(4, 2));
//        System.out.println(isPrime(12));
        //  printPrime(10);
        binToDec(101);
    }
}
