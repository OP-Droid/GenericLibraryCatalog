import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Catalog<LibraryItem> catalog = new Catalog<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Catalog Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Catalog");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Item ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter Author: ");
                        String author = scanner.nextLine();

                        catalog.addItem(new LibraryItem(title, author, id));
                        break;

                    case 2:
                        System.out.print("Enter Item ID to remove: ");
                        String removeID = scanner.nextLine();
                        catalog.removeItem(removeID);
                        break;

                    case 3:
                        catalog.displayCatalog();
                        break;

                    case 4:
                        System.out.println("Exiting program...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
