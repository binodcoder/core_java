package binod;
public class ReverseStringRecursion {
    public static void printReverse(String name, int idx) {
        if (idx == 0) {
            System.out.print(name.charAt(idx));
            return;
        }
        System.out.print(name.charAt(idx));
        printReverse(name, idx - 1);
    }
    public static void main(String[] args) {
        String name = "binod";
        printReverse(name, name.length()-1);
    }
}
