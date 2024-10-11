
import java.util.Scanner;

public class IT24102857Lab7Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double DISCOUNT_RATE = 0.05;
        double finalAmount = 0;

        // Loop for 5 customers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter the total bill amount: ");
            double billAmount = scanner.nextDouble();

            System.out.print("Enter mode of payment (C for Cash, O for Other): ");
            char paymentMode = scanner.next().charAt(0);

            // Check for valid payment modes
            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = billAmount * DISCOUNT_RATE;
                finalAmount = billAmount - discount;
                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + finalAmount);

                //Other payment
            } else if (paymentMode == 'O' || paymentMode == 'o') {

                System.out.println("No discount applied.");
                System.out.println("Amount to be paid: " + billAmount);

            } else {
                System.out.println("Payment Mode is Not Valid.");
                continue;
            }

            System.out.println();
        }

        scanner.close();
    }
}
