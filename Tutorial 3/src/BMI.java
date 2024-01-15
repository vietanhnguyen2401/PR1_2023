import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight (kg): ");
        int weight=sc.nextInt();
        System.out.println("Enter your height (m): ");
        float height= sc.nextFloat();
        float BMI= weight/(height*height);
        System.out.println("Your BMI: "+BMI+"(kg/m2)");
    }
}
