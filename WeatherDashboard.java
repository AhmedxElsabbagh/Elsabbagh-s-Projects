import java.util.Scanner;

public class WeatherDashboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Weather Dashboard ===");
            System.out.println("Current Date and Time: 03:26 PM EEST, Friday, July 11, 2025");
            System.out.println("1. Alexandria, Egypt");
            System.out.println("2. Cairo, Egypt");
            System.out.println("3. London, UK");
            System.out.println("4. Exit");
            System.out.print("Choose a city or option (1-4): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\n=== Weather for Alexandria, Egypt ===");
                    System.out.println("Temperature: 28°C");
                    System.out.println("Condition: Sunny");
                    System.out.println("Humidity: 65%");
                    break;

                case 2:
                    System.out.println("\n=== Weather for Cairo, Egypt ===");
                    System.out.println("Temperature: 32°C");
                    System.out.println("Condition: Partly Cloudy");
                    System.out.println("Humidity: 50%");
                    break;

                case 3:
                    System.out.println("\n=== Weather for London, UK ===");
                    System.out.println("Temperature: 18°C");
                    System.out.println("Condition: Rainy");
                    System.out.println("Humidity: 80%");
                    break;

                case 4:
                    System.out.println("Exiting Weather Dashboard. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }
    }
}