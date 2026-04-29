import java.util.Scanner;
import java.util.Arrays;

public class Seriesq8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Records Program");

        int n;
        System.out.print("Enter number of student records you want to add: ");
        n = scanner.nextInt();

        String[] name = new String[n];
        int[] rolln = new int[n];
        float[] prnt = new float[n];

        // Input loop
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll no: ");
            rolln[i] = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Enter name: ");
            name[i] = scanner.nextLine();

            System.out.print("Enter percentage: ");
            prnt[i] = scanner.nextFloat();
        }

        // Menu loop
        while (true) {
            System.out.println("\nEnter any value 1 to 5 for operations and 6 for exit:");
            char x = scanner.next().charAt(0);

            switch (x) {
                case '1':
                    System.out.print("Enter rollno for search: ");
                    int rl = scanner.nextInt();
                    boolean foundRoll = false;
                    for (int i = 0; i < n; i++) {
                        if (rl == rolln[i]) {
                            System.out.println("Roll No: " + rolln[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Percentage: " + prnt[i]);
                            foundRoll = true;
                            break;
                        }
                    }
                    if (!foundRoll) {
                        System.out.println("No record found with that roll number.");
                    }
                    break;

                case '2':
                    System.out.print("Enter name for search: ");
                    scanner.nextLine(); // consume newline
                    String nm = scanner.nextLine();
                    boolean foundName = false;
                    for (int i = 0; i < n; i++) {
                        if (nm.equals(name[i])) {
                            System.out.println("Roll No: " + rolln[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Percentage: " + prnt[i]);
                            foundName = true;
                            break;
                        }
                    }
                    if (!foundName) {
                        System.out.println("No record found with that name.");
                    }
                    break;

                case '3':
                    System.out.println("All student records:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Roll No: " + rolln[i] + ", Name: " + name[i] + ", Percentage: " + prnt[i]);
                    }
                    break;

                case '4':
                    System.out.println("Record of Topper Student:");
                    float top = prnt[0];
                    int index = 0;
                    for (int i = 1; i < n; i++) {
                        if (prnt[i] > top) {
                            top = prnt[i];
                            index = i;
                        }
                    }
                    System.out.println("Roll No: " + rolln[index]);
                    System.out.println("Name: " + name[index]);
                    System.out.println("Percentage: " + prnt[index]);
                    break;

                case '5':
                    System.out.println("Students who got more than 50%:");
                    for (int i = 0; i < n; i++) {
                        if (prnt[i] > 50.0f) {
                            System.out.println("Roll No: " + rolln[i] + ", Name: " + name[i] + ", Percentage: " + prnt[i]);
                        }
                    }
                    break;

                case '6':
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1 to 6.");
            }
        }
    }
}
