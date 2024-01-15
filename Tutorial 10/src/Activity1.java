import java.util.Scanner;
public class Activity1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice !=5){
            //menu
            System.out.println("[1] Add item");
            System.out.println("[2] Item list");
            System.out.println("[3] Edit an item");
            System.out.println("[4] Remove an item");
            System.out.println("[5] Quit");
            //user option
            System.out.println("Choose an option: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    listItem();
                    break;
                case 3:
                    editItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    System.out.println("Goodbye!\n");
                    break;
                default:
                    System.out.println("Please choose from 1 to 5\n");
                    break;
            }
        }
    }
    public static void addItem(){
        System.out.println("Adding a new item \n");
    }
    public static void listItem(){
        System.out.println("Listing all item \n");
    }
    public static void editItem(){
        System.out.println("Editing an item \n");
    }
    public static void removeItem(){
        System.out.println("Removing an item \n");
    }
}
