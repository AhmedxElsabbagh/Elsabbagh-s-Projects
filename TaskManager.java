import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            }
            
            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine().trim();
                    if (!task.isEmpty()) {
                        tasks.add(task);
                        System.out.println("Task added successfully!");
                    } else {
                        System.out.println("Task cannot be empty.");
                    }
                    break;
                    
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                    
                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        System.out.print("Enter task number to delete: ");
                        try {
                            int index = Integer.parseInt(scanner.nextLine()) - 1;
                            if (index >= 0 && index < tasks.size()) {
                                tasks.remove(index);
                                System.out.println("Task deleted successfully!");
                            } else {
                                System.out.println("Invalid task number.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number.");
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }
    }
}