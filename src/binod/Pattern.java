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

class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int line = n; line >= 1; line--) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
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

class Pattern8 {
    public static void main(String[] args) {
        int num = 1;
        for (int line = 1; line <= 5; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(num);
                num += 1;
            }
            System.out.println();
        }
    }
}

class Pattern9 {
    public static void hollow_rectangle(int totRows, int totCols) {
        //outer loop
        for (int i = 1; i <= totRows; i++) {
            //inner - columns
            for (int j = 1; j <= totCols; j++) {
                //cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);

    }
}

class Pattern10 {
    public static void inverted_rotated_half_pyramid(int n) {
        //outer
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        inverted_rotated_half_pyramid(4);
    }
}

class Pattern11 {

    public static void invertedHalfPyramidWithNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramidWithNumbers(5);
    }
}

class Pattern12 {
    public static void fLoydsTriangle(int n) {
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fLoydsTriangle(5);
    }
}

class Pattern13 {
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(5);
    }
}

class Pattern14 {
    public static void printButterfly(int n) {
        //1st half
        for (int i = 1; i <= n; i++) {
            //stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces -2*(n-1)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            //stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            //stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces -2*(n-1)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            //stars -i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printButterfly(4);
    }
}

class Pattern15 {
    public static void printSolidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSolidRhombus(5);
    }
}

class Pattern16 {
    public static void printHollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= n; j++) {
                //cell - (i,j)
                if (i == 1 || i == n || j == 1 || j == n) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHollowRhombus(5);
    }
}

class Pattern17 {
    public static void printDiamond(int n) {

        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = n; i >= 1; i--) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDiamond(4);
    }
}



