
import java.util.*;

public class IT24102240Lab7Q1A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num;
        double avg = 0;
        double total = 0;

        System.out.println("Enter Marks for four subjects:");

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Subject Mark " + i + ": ");
            num = sc.nextDouble();
            total += num;
            avg = total / 4;

        }
        System.out.println("Average is : " + avg);

        if (avg >= 75 && avg < 100) {
            System.out.println("Overall Grade is : Distinction");
        }
        if (avg >= 50 && avg <= 74) {
            System.out.println("Overall Grade is : Credit");
        }
        if (avg < 50) {
            System.out.println("Overall Grade is : Fail");
        }
        sc.close();

    }

}
