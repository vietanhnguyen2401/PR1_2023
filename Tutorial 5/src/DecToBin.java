import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String binary= toBinary(number);
        System.out.println("The result: "+binary);
    }
    public static String toBinary (int number){
        String binary="";
        while(number>0){
            int remainder = number%2;
            binary=remainder+binary;
            number = number/2;
        }
        return binary;
    }

}
