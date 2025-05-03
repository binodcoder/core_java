package binod.arrays;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int[] marks = new int[50];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("math " + marks[0]);
        System.out.println("eng " + marks[1]);
        System.out.println("science " + marks[2]);

    }
}

class Example1 {
    public static int linearSearch(int[] num, int k) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static int stringSearch(String[] menus, String item) {
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] menu = {"dosa", "chole bhature", "somasa", "chowmin"};
        String item = "somasa";
        int[] numbers = {2, 4, 6, 10, 1, 5};
        int key = 10;

        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found at" + index);
        }
        int in = stringSearch(menu, item);
        if (in == -1) {
            System.out.println("not found");
        } else {
            System.out.println("fount at " + in);
        }
    }
}

//Time complexity = O(n)
class Example2 {
    public static void update(int[] marks, int nonChangable) {
        nonChangable = 20;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int[] marks = {97, 98, 99};
        int nonChangable = 5;
        System.out.println(nonChangable);
        update(marks, nonChangable);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
}

class Example3 {

    public static int getLargest(int[] num) {
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < num.length - 1; i++) {
            if (l < num[i + 1]) {
                l = num[i];
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 6, 3, 5};
        int lar = getLargest(num);
        System.out.println(lar);

    }

}

class Example4 {

    public static int getSmallest(int[] num) {
        int s = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < s) {
                s = num[i];
            }
        }
        return s;

    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, 7, 9, 2};
        int smallest = getSmallest(numbers);
        System.out.println(smallest);
    }
}

class BinarySearch {
    public static int binarySearch(int[] num, int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            //comparisons
            if (num[mid] == key) {//found
                return mid;
            }
            if (num[mid] < key) {//right
                start = mid + 1;
            } else {//left
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("index for key is: " + binarySearch(numbers, key));
    }
}

class BinarySearch1 {
    public static int binarySearch(int[] num, int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }
            if (key > num[mid]) {
                //right
                start = mid + 1;

            } else {
                //left
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 6, 4, 9, 5};
        int key = 9;
        System.out.println("Index of of $key is " + binarySearch(numbers, key));

    }
}

class ReverseArray {
    public static void reverse(int[] num) {

        int start = 0;
        int end = num.length - 1;

        while (start < end) {
            //swap elements
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            // move towards center
            start++;
            end--;

        }
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 6};
        reverse(numbers);
        for (int n : numbers) {
            System.out.print(n);
        }

    }
}

class Pairs {
    public static void getPairs(int[] num) {
        int tp = 0;
        for (int i = 0; i < num.length; i++) {
            int current = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + current + "," + num[j] + ")" + " ");
                tp++;

            }
            System.out.println();
        }
        /*
        formula to find  tp
        sum of nth num : 1+2+3+4+ ...... n
        sum=n(n+1)/2
         */
        System.out.println("Total pairs: " + tp);
    }

    public static void main(String[] args) {
        int[] numbers = {4, 3, 6, 7, 9, 2};
        getPairs(numbers);
    }
}

class SubArray {
    public static void printSubArray(int[] num) {
        int ts=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum=0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum=sum+num[k];

                }
                ts++;
                System.out.print("="+sum);
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total sub array "+ ts);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 4, 7, 8};
        printSubArray(numbers);

    }
}