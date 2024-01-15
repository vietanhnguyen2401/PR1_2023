import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        boolean prime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
//            if (n ==0||n==1){
//                prime = false;
//                break;
//            }
        }
        if (n==0||n==1) {
            System.out.println(n + " is not a prime number.");
        } else if(prime) {
            System.out.println(n + " is a prime number.");
        }
//        System.out.println("All prime numbers between 1000 and 2000");
//        for (int i=1000; i <=2000; i++) {
//            if (prime = true) {
//                System.out.println(i+",");
//            }
//        }
    }
}
