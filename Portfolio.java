import java.util.Scanner;

public class Portfolio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Ahmed Elsabbagh's Portfolio ===");
            System.out.println("Current Date and Time: 03:22 PM EEST, Friday, July 11, 2025");
            System.out.println("1. About Me");
            System.out.println("2. Skills");
            System.out.println("3. Projects");
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
                    System.out.println("\n=== About Me ===");
                    System.out.println("Name: Ahmed Elsabbagh");
                    System.out.println("Age: 19 years old");
                    System.out.println("Education: Second-year student in Computer Science and Data Science, Alexandria University");
                    System.out.println("Description: I am a passionate developer with extensive experience in Java, intermediate skills in Python, and I am actively working to enhance my cpp abilities. I love learning other programming languages and strive to improve my technical and soft skills.");
                    break;

                case 2:
                    System.out.println("\n=== Skills ===");
                    System.out.println("1. Java - Advanced");
                    System.out.println("2. Python - Intermediate");
                    System.out.println("3. cpp - Beginner");
                    break;

                case 3:
                    System.out.println("\n=== Projects ===");
                    System.out.println("1. Task Manager App");
                    System.out.println("   - Description: A console-based Java application to manage tasks.");
                    System.out.println("   - GitHub: https://github.com/username/task-manager");
                    System.out.println("2. Personal Portfolio Website");
                    System.out.println("   - Description: A text-based Java portfolio showcasing my skills and projects.");
                    System.out.println("   - GitHub: https://github.com/username/portfolio");
                    System.out.println("3. Weather Dashboard");
                    System.out.println("   - Description: A planned app to display real-time weather updates (in development).");
                    System.out.println("   - GitHub: https://github.com/username/weather-dashboard");
                    break;

                case 4:
                    System.out.println("Exiting Portfolio. Thank you for visiting!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }
    }
}