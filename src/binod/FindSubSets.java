package binod;
import java.util.ArrayList;
public class FindSubSets {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = -0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubSets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }
        //if add
        subset.add(n);
        findSubSets(n - 1, subset);
        //if not add
        subset.remove(subset.size() - 1);
        findSubSets(n - 1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubSets(n, subset);
    }
}
