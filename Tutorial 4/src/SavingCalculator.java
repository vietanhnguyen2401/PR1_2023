import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many years do you want to deposit your money? ");
        int years = sc.nextInt();
        System.out.println("How much money? ");
        float money = sc.nextFloat();
        System.out.println("What's the interest rate (%)? ");
        float rate = sc.nextFloat();

        for (int i = 0; i < years; i++) {
            money += money * (rate / 100);
        }

        System.out.print("After " + years + " years, you'll receive " + money + ".");
    }
}
