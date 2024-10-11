
import java.util.*;

public class IT24102240Lab7Q1B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double avg;
        double total;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks :");
            double mark1 = sc.nextDouble();
            double mark2 = sc.nextDouble();
            double mark3 = sc.nextDouble();
            double mark4 = sc.nextDouble();

            total = mark1 + mark2 + mark3 + mark4;
            avg = total / 4;

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
            System.out.println("");

        }
        sc.close();
    }

}
