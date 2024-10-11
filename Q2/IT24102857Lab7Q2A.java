
public class IT24102857Lab7Q2A {

    public static void main(String[] args) {

        //Outer loop for row
        for (int i = 0; i < 4; i++) {

            // Inner loop for each column
            for (int j = 0; j < 5; j++) {
                System.out.print("$ ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

}
