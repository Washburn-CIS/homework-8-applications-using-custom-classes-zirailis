import java.util.Scanner;

public class GradeBook {
    private static Student[] students;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the CM111 Grade Book App!");

        while(true) {
            System.out.println("\nPlease make a selection:\n");
            System.out.println("1) Load a gradebook from a file");
            System.out.println("2) List Class Roster");
            System.out.println("3) Enter Project Grade");
            System.out.println("4) Enter Exam Grade");
            System.out.println("5) Enter Lab Grade");
            System.out.println("6) Enter Participation Score");
            System.out.println("7) Print Overall Grades");
            System.out.println("8) Save gradebook to a file");
            System.out.println("9) Exit");
            System.out.print("\nPlease choose an option: ");
            String choice = input.nextLine();
            System.out.println();
            switch(choice) {
                case "1":
                    System.out.println("Option not implemented.");
                    continue;
                case "2":
                    continue;
                case "3":
                    System.out.println("Option not implemented.");
                    continue;
                case "4":
                    System.out.println("Option not implemented.");
                    continue;
                case "5":
                    System.out.println("Option not implemented.");
                    continue;
                case "6":
                    System.out.println("Option not implemented.");
                    continue;
                case "7":
                    System.out.println("Option not implemented.");
                    continue;
                case "8":
                    System.out.println("Option not implemented.");
                    continue;
                case "9":
                    System.out.println("Goodbye!");
                    return;
            }
        }
    }
}
