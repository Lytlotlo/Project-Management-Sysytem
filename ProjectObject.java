import javax.swing.JOptionPane;
import java.util.*;

public class ProjectObject {
	//Attributes.
	int projectNumber;
	String projectName;
	String buildingType;
	String projectAddress;
	int erfNumber;
    int projectFee;
    int totalAmount;
	String deadline;
	
	//Constructor with project object attributes.
	public ProjectObject(int projectNumber, String projectName, String buildingType, String projectAddress
		, int erfNumber, int projectFee, int totalAmount, String deadline) {
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.projectAddress = projectAddress;
		this.erfNumber = erfNumber;
		this.projectFee = projectFee;
		this.totalAmount = totalAmount;
		this.deadline = deadline;
	}
	
	//Call scanner function to input data.
	Scanner input = new Scanner(System.in);
	
	//toSring method to print out attributes.
	public String toString() {
		String output = "Project Number: " + projectNumber;
		output += "Project Name: " + projectName;
		output += "Building Type: " + buildingType;
		output += "Project Address: " + projectAddress;
		output += "ERF Number: " + erfNumber;
		output += "Project Fee: " + projectFee;
		output += "Total Amount paid to date: " + totalAmount;
		output += "Deadline: " + deadline;
		return output;
	}
	
	//Method to change the due date of the project.
	public String dueDate() {
		System.out.println("Enter date in the format YYYY/MM/DD.");
		deadline = input.nextLine();
		return "Due date has been changed.";
	}
	
	//Method to change the amount of fee paid to date.
	public int changeTotal() {
		totalAmount = Integer.parseInt( JOptionPane.showInputDialog("Enter an amount:"));
		System.out.println("Amount has been changed to:");
		return totalAmount;	
	}
	
   //Method to return an object by project number.
	public int getProject() {
		return projectNumber;
	}
		
	//Method to get invoice.
	public int getTotalAmount() {
		return totalAmount;
	}
		
	//Method to get project fee.
	public int getProjectFee() {
		return projectFee;
	}
}
	

