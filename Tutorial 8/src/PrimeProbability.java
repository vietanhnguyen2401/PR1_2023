import java.util.Random;

public class PrimeProbability {
    static int num;
    static int count=0;
    public static void main(String[] args) {
        Random random= new Random();
        for (int i =0; i<100; i++){
            do{
                num = random.nextInt(1000);
            } while (num<2);
            for (int j =2; j<100; j++){
                if (num % j==0){
                    count++;
                    break;
                }
            }
        }
        System.out.println("The probability that a number is a prime number: "+count+"%");
    }
}
