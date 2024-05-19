package binod;
import java.util.Scanner;
public class Average25ExamScores {
    public static void main(String[] args) {
        double sum=0;
        double average=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input scores of students");

        for(int i=0;i<25;i++){
            double score=scanner.nextDouble();
            sum=sum+score;
        }
        average=sum/25;
        System.out.println("The average score is: "+average);
    }
}
