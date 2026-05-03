import java.util.Scanner;

public class TrainConsistManagementApp {

    // Method to perform Linear Search
    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        // Traverse the array sequentially
        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(searchKey)) {
                return true; // Match found → early termination
            }
        }

        return false; // No match found
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");
        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        // Input bogie IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = scanner.nextLine();
        }

        // Input search key
        System.out.print("\nEnter bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // Perform Linear Search
        boolean found = searchBogie(bogieIds, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the train consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found.");
        }

        scanner.close();
    }
}
