// Imports java.time library
import java.time.LocalDate;

// project class with attributes of the class
public class Project {
    int projectNumber;
    String projectName;
    String buildingType;
    String projectAddress;
    int efrNumber;
    double totalAmountPaid;
    int yearDate;
    int monthDate;
    int dayDate;
    LocalDate deadline;

    // Constructor method
    public Project(int projectNumber, String projectName, String buildingType,
                   String projectAddress, int efrNumber, double totalAmountPaid, int yearDate ,
                   int monthDate, int dayDate){

        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.projectAddress = projectAddress;
        this.efrNumber = efrNumber;
        this.totalAmountPaid = totalAmountPaid;
        this.yearDate = yearDate;
        this.monthDate = monthDate;
        this.dayDate = dayDate;
        this.deadline = LocalDate.of(yearDate,monthDate, dayDate);
    }

    // To string method
    public String toString(){
        String output = "Project Number: " + projectNumber + "\n";
        output += "Project Name: " + projectName + "\n";
        output += "Building Type: " + buildingType + "\n";
        output += "Project Address: " + projectAddress + "\n";
        output += "EFR Number: " + efrNumber + "\n";
        output += "Total Amount Paid: " + "R" + totalAmountPaid + "\n";
        output += "Due Date: " + deadline + "\n";

        return output;
    }

    // Setter method ( setting a new due date )
    public LocalDate setDeadline(int newYear, int newMonth, int newDay){
        this.deadline = LocalDate.of(newYear,newMonth, newDay);
        return deadline;
    }

    // Setter method ( setting a new total of fee's paid )
    public double setPaidFees(double newPaidFees){
        this.totalAmountPaid = newPaidFees;
        return totalAmountPaid;
    }


}
