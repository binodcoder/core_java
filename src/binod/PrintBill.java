package binod;
import java.util.Scanner;
public class PrintBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cost of pencil:");
        float costOfPencil = scanner.nextFloat();
        System.out.println("Enter cost of pen");
        float costOfPen = scanner.nextFloat();
        System.out.println("Enter cost of eraser");
        float costOfEraser = scanner.nextFloat();
        final float taxRate = 0.18f;
        float totalCostWithoutTax = costOfPencil + costOfPen + costOfEraser;
        float taxForPencil = taxRate * costOfPencil;
        float taxForPen = taxRate * costOfPen;
        float taxForEraser = taxRate * costOfEraser;
        float totalTax = taxForPencil + taxForPen + taxForEraser;
        float costOfPencilWithTax = costOfPencil + taxForPencil;
        float costOfPenWithTax = costOfPen + taxForPen;
        float costOfEraserWithTax = costOfEraser + taxForEraser;
        float totalCostWithTax = costOfPencilWithTax + costOfPenWithTax + costOfEraserWithTax;
        System.out.println("Item\tCost\tTax\tPrice");
        System.out.println("----------------------------------");
        System.out.println("Pencil\t" + costOfPencil + "\t" + taxForPencil + "\t" + costOfPencilWithTax);
        System.out.println("Pen\t" + costOfPen + "\t" + taxForPen + "\t" + costOfPenWithTax);
        System.out.println("Eraser\t" + costOfEraser + "\t" + taxForEraser + "\t" + costOfEraserWithTax);
        System.out.println("----------------------------------");
        System.out.println("Total\t" + totalCostWithoutTax + "\t" + totalTax + "\t" + totalCostWithTax);
    }
}
