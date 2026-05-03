import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    // Method to sort bogie names using Arrays.sort()
    public static void sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames); // Built-in optimized sorting
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");
        System.out.print("Enter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] bogieNames = new String[n];

        // Input bogie names
        System.out.println("Enter bogie names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = scanner.nextLine();
        }

        // Before sorting
        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Sorting using Arrays.sort()
        sortBogieNames(bogieNames);

        // After sorting
        System.out.println("\nAfter Sorting (Alphabetical Order):");
        System.out.println(Arrays.toString(bogieNames));

        scanner.close();
    }
}
