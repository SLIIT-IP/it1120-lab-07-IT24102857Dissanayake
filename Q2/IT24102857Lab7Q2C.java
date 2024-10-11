
public class IT24102857Lab7Q2C {

    public static void main(String[] args) {

        //Outer loop for numers
        for (int i = 5; i >= 1; i--) {

            // Inner loop for each column
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line after printing stars
            System.out.println();
        }
    }

}
