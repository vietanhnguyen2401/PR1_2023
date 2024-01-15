import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a: ");
        double a = sc.nextDouble();
        System.out.print("Please enter b: ");
        double b = sc.nextDouble();
        System.out.print("Please enter c: ");
        double c = sc.nextDouble();
        if (a==0 && b==0 && c==0){
            System.out.print("The equation can't solve!");
        }else if(a==0 && b==0 && c!=0) {
            System.out.print("The equation has no roots.");
        }else if(a==0 && b !=0 && c !=0) {
            System.out.print("The equation has 1 root: x= "+ -c/b);
        }else if ((b*b-4*a*c) <0){
            System.out.print("The equation has no real root.");
        }else {
            double sqrt=Math.sqrt(b*b-4*a*c);
            double x1= (-b + sqrt)/(2*a);
            double x2= (-b - sqrt)/(2*a);
            System.out.print("The system has two roots: x1= "+x1+", "+"x2= "+x2);
        }
    }
}
