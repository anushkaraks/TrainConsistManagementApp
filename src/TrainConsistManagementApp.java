import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("========================================\n");

        LinkedList<String> consist = new LinkedList<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(consist);

        consist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(consist);

        consist.removeFirst();
        consist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(consist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}