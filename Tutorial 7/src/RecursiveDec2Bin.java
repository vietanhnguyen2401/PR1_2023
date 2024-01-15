import java.util.Scanner;
public class RecursiveDec2Bin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number to convert to binary: ");
        int n = scan.nextInt();
        String binary = toBinary(n);
        System.out.println("Binary of " + n + " is " + binary);
    }

    public static String toBinary(int num) {
        String result = "";
        if (num == 0 && num == 1) {
            return result += num;
        } else {
            while (num > 0) {
                int remain = num % 2;
                num = num / 2;
                result = remain + result;
            }
            return result;
        }
    }
}
