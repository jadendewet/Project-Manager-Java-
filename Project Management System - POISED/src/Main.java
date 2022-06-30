// Imports libraries
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

// Main method
public class Main {
    public static void main(String[] args) {

        // Creates a scanner object
        Scanner input = new Scanner(System.in);

        // Declares temp variables
        int projectNumber = 0;
        int year = 0;

        // Create instances of the person and project class
        Person contractor = new Person("Contractor","Dave","0730976351","dave@google.com","10 Bankhoven Street");
        Project house1 = new Project(12,"Daveys", "House", "12 Bloekem Ave",22123, 225989.23,2012,11,26);

        // Defensive programming, in case the user enters an incorrect data type
        try{
            System.out.println("Enter a project number for the project: ");
            projectNumber = input.nextInt();
        }

        catch (InputMismatchException e) {
            System.out.println("Please enter a valid project number");
        }

        input.nextLine();

        // Prints a message and receives user inputs
        System.out.println("Enter the name of the project: ");
        String projectName = input.next();

        System.out.println("Enter the building type of the project ( House, Apartment, ect ) ");
        String buildingType = input.next();

        System.out.println("Enter the address of the project: ");
        String projectAddress = input.next();
        input.nextLine();

        System.out.println("Enter the erf number of the project: ");
        int erfNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter the total amount paid for the project: ");
        double totalAmountPaid = input.nextDouble();
        input.nextLine();

        // Defensive programing, in case the user enters the name of the year
        try{
            System.out.println("Enter the year the project is due : ");
             year = input.nextInt();
        }

        catch (InputMismatchException e) {
            System.out.println("Please enter the year as a number");
        }

        System.out.println("Enter the number of the month the project is due: ");
        int month = input.nextInt();

        System.out.println("Enter the number of the day the project is due: ");
        int day = input.nextInt();

        // Creates an instance of the project class using user input
        Project newProject = new Project(projectNumber,projectName,buildingType,projectAddress,
                erfNumber,totalAmountPaid,year,month,day);

        // Prints the project using the toString method
        System.out.println();
        System.out.println(newProject);

        // Creates a control variable for the while loop
        boolean menu = true;

        // While loop to ask what the user wants to do
        while (menu){

            input.nextLine();
            // Receives user input

            System.out.println("""
                    What would you like to do: \s
                    1) Change project due date\s
                    2) Change total amount of fees paid\s
                    3) Update the contractor's details\s
                    4) Finalise project\s
                    5) Exit""");

            // Receives user input
            int menuChoice = input.nextInt();

                // If user enters 1 - requests input to create a new due date for the project
                if(menuChoice == 1){
                    System.out.println("Enter the new year of the project: ");
                    int newYear = input.nextInt();

                    System.out.println("Enter the new month of the project: ");
                    int newMonth = input.nextInt();

                    System.out.println("Enter the new day of the project: ");
                    int newDay = input.nextInt();

                    LocalDate newDate = LocalDate.of(newYear,newMonth,newDay);

                    System.out.println("The new date is : " + newDate);
                    newProject.setDeadline(newYear,newMonth,newDay);
                }

                // Else if the user enters 2 - requests user input for the new total amount of fee's paid
                else if (menuChoice == 2) {
                    System.out.println("Enter the new total amount of fees paid: ");
                    double newTotalAmountPaid = input.nextDouble();
                    newProject.setPaidFees(newTotalAmountPaid);
                }

                // Else if the user enters 3 - requests user input to update the contractor's details
                else if (menuChoice == 3) {
                    System.out.println("Enter the new cellphone number of the contractor: ");
                    String newTelephoneNumber = input.next();

                    System.out.println("Enter the new email address of the contractor: ");
                    String newEmail = input.next();

                    System.out.println("Enter the new address of the contractor");
                    String newAddress = input.next();

                    contractor.setNewDetails(newTelephoneNumber,newEmail,newAddress);
                    System.out.println("The contractors details have been updated \n");
                }

                else if(menuChoice == 4){
                    System.out.println("Project Finalised!");
                }

                // Else if the user enters 4 - displays a goodbye message and ends the loop
                else if (menuChoice == 5){
                    System.out.println("Thank you for using our program - Goodbye!");
                    break;
                }
        }


    }
}