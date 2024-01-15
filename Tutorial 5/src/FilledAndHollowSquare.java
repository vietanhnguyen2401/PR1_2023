import java.util.Scanner;

public class FilledAndHollowSquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer to display a filled and hollow square: ");
        int n = sc.nextInt();
        StringBuilder filled = new StringBuilder(n);

        // create objects
        StringBuilder hollow = new StringBuilder(n);

        for (int i = 1; i <= n; i++) { // outer loop for length of the square

            for (int j = 1; j <= n; j++) { // inner loop for width of square

                filled.append("*"); //display asterisks

                if (i == 1 || i == n || j == 1 || j == n) { // condition to display stars

                    hollow.append("*");
                }
                else {
                    hollow.append(" ");
                }
            } // display empty spaces

            System.out.println(filled + "   " + hollow);

            // places hollow and filled squares next to each other

            filled. delete(0, filled.length());
            //removes characters from 0 to the length of filled square

            hollow. delete(0, hollow.length());
        }
    }
}
