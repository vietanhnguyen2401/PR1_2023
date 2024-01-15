import java.util.Scanner;
import java.util.HashMap;
public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Double> score = new HashMap<>();
        score.put("Nguyen",9.5);
        score.put("Duc",8.5);
        score.put("Viet",7.5);
        score.put("Anh",6.5);
        System.out.print("Enter the name of students: ");
        String name = sc.nextLine();
        if(score.containsKey(name)){
            System.out.println(score.get(name));
        }else{
            System.out.println("score not found");
        }

    }
}
