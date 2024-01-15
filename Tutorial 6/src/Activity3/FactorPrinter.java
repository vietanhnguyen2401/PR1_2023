package Activity3;
import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        scanner.close();

        FactorGenerator factorGenerator = new FactorGenerator(userInput);

        System.out.print("Factors of " + userInput + ": ");
        while (factorGenerator.hasMoreFactors()) {
            int factor = factorGenerator.nextFactor();
            System.out.print(factor + " ");
        }
    }
}


