import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean gotIt = false;
        while (!gotIt) {
            int number = 0;
            try {
                System.out.print("Integer between 1000 and 999999: ");
                number = sc.nextInt();
                sc.nextLine();
                if (number >= 1000 && number <= 999999) {
                    int before = number / 1000;
                    int after = number % 1000;
                    String zeros = "";
                    if (after < 10) {
                        zeros = "00";
                    } else if (after < 100) {
                        zeros = "0";
                    }
                    System.out.println(before + "," + zeros + after);
                }
                gotIt = true;
            } catch (Exception e) {
                System.err.println("Please try again!!");
                sc.nextLine();
            }

            /**int before = number / 1000;
            int after = number % 1000;
            String zeros = "";
            if (after < 10) {
                zeros = "00";
            } else if (after < 100) {
                zeros = "0";
            }
            System.out.println(before + "," + zeros + after);
        }*/
        }
    }
}
