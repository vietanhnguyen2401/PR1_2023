import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("What integer you want to calculate factorial for?");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 1;
        int i = 1;
        if (a < 0) {
            System.out.println("There is no factorial for negative.");
        } else {
            for (i=1;i <= a;i++) {
                b = b * i;
            }

//            while(i <=a ){
//                b = b*i;
//                i++;
//            }
            System.out.println("Factorial of " + a + " is: " + b);
        }
    }
}

