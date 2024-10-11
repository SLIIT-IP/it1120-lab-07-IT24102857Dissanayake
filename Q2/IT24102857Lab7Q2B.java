
public class IT24102857Lab7Q2B {

    public static void main(String[] args) {

        //Outer loop for numers
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " " + " - " + " ");

            // Inner loop for each column
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing stars
            System.out.println();
        }
    }

}
