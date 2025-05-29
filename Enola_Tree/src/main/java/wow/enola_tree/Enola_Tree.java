



// Karl Nino Enola and Jeremiah B. Ignacio

package wow.enola_tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class Enola_Tree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> baon = new LinkedList<>();

        
        for (String arg : args) {
            try {
                baon.add(Integer.parseInt(arg));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input in args: " + arg);
            }
        }

        while (true) {
            System.out.println("\nBaon");
            System.out.println("1. Display Student's Baon");
            System.out.println("2. Add Student's Baon");
            System.out.println("3. Exit");
            String choice = scan.nextLine().trim();

            switch (choice) {
                case "1":
                    viewBaon(baon);
                    break;
                case "2":
                    addBaon(scan, baon);
                    break;
                case "3":
                    System.out.println("Exiting. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void viewBaon(LinkedList<Integer> baon) {
    if (baon.isEmpty()) {
        System.out.println("There is no baon amount added.");
    } else {
        
        LinkedList<Integer> sortedBaon = new LinkedList<>(baon);
        sortedBaon.sort(Collections.reverseOrder());

        System.out.println("Student's Baon (from largest to smallest):");
        for (int i = 0; i < sortedBaon.size(); i++) {
            System.out.println((i + 1) + ". " + sortedBaon.get(i));
        }
    }
}

    private static void addBaon(Scanner scan, LinkedList<Integer> baon) {
    System.out.println("Enter baon amounts one by one. Type 'done' to finish.");

    while (true) {
        System.out.print("Baon amount: ");
        String input = scan.nextLine().trim();

        if (input.equalsIgnoreCase("done")) {
            System.out.println("Finished adding baon amounts.");
            break;
        }

        if (input.isEmpty()) {
            System.out.println("Baon amount cannot be empty.");
            continue;
        }

        try {
            int amount = Integer.parseInt(input);
            baon.add(amount);
            System.out.println("Baon added.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Please enter a valid integer or type 'done'.");
        }
    }
    
 }
}

