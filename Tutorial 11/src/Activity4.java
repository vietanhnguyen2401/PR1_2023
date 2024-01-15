import java.util.*;

public class Activity4 {
    public static void main(String[] args) {
        Map<String, List<String>> classMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a student to a class");
            System.out.println("2. Display all students in a class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent(classMap, scanner);
                    break;
                case 2:
                    displayStudents(classMap, scanner);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addStudent(Map<String, List<String>> classMap, Scanner scanner) {
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();

        // If the class doesn't exist, create a new one
        classMap.putIfAbsent(className, new ArrayList<>());

        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();

        // Add the student to the class
        classMap.get(className).add(studentName);

        System.out.println("Student added to class successfully!");
    }

    private static void displayStudents(Map<String, List<String>> classMap, Scanner scanner) {
        System.out.print("Enter the class name: ");
        String className = scanner.nextLine();

        // Check if the class exists
        if (classMap.containsKey(className)) {
            List<String> students = classMap.get(className);

            System.out.println("Students in class " + className + ":");
            for (String student : students) {
                System.out.println(student);
            }
        } else {
            System.out.println("Class not found.");
        }
    }
}

