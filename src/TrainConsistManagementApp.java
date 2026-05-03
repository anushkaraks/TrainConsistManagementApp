import java.util.Scanner;

public class TrainConsistApp {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if elements are in wrong order
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }
  
    public static void display(int[] capacities) {
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");
        System.out.print("Enter number of passenger bogies: ");
        int n = scanner.nextInt();

        int[] capacities = new int[n];
        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = scanner.nextInt();
        }

        System.out.println("\nBefore Sorting:");
        display(capacities);

        bubbleSort(capacities);

        System.out.println("\nAfter Sorting (Ascending Order):");
        display(capacities);

        scanner.close();
    }
}
