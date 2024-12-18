package binod;
public class Pattern {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern2 {
    public static void main(String[] args) {
        for (int line = 0; line < 5; line++) {
            for (int star = 0; star < star; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern3 {
    public static void main(String[] args) {
        //n=5
        for (int line = 1; line <= 4; line++) {
            //(n-line)+1
            for (int star = 4; star >= line; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern4 {
    public static void main(String[] args) {
        for (int line = 1; line < 4; line++) {
            for (int star = 1; star <= line; star++) {
            }
        }
    }
}

class Pattern5 {
    public static void main(String[] args) {
        int n = 0;
        for (int line = 1; line <= 4; line++) {
            n = n * 10 + line;
            System.out.println(n);
        }
    }
}

class Pattern6 {
    public static void main(String[] args) {
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}

class Pattern7 {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
