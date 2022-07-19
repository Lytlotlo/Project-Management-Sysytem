import javax.swing.JOptionPane;
import java.util.*;

public class Person {
	//Person attributes.
	String name;
	int telephoneNumber;
	String emailAddress;
	String physicalAddress;
	String projectRole;
	
	//Constructor with person attributes.
	public Person(String name, int telephoneNumber, String emailAddress ,String physicalAddress, String projectRole ) {
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;
		this.projectRole = projectRole;
	}
	
	//Call scanner function to input data.
	Scanner input = new Scanner(System.in);
		
	//toSring method to print out attributes.
	public String toString() {
		String output = "Name: " + name;
		output += "Telephone Number: " + telephoneNumber;
		output += "Email Address: " + emailAddress;
		output += "Physical Address: " + physicalAddress;
		output += "Project Role: " + projectRole;
		return output;
	}
	
	//Method to update contractors details.
	public String updateContact() {
		telephoneNumber = Integer.parseInt( JOptionPane.showInputDialog("Enter telephone number:"));
		emailAddress = input.nextLine();
		return ("Contact details have been updated.");
	} 
	
	//method to get name of a person.
	public String getName() {
		return name;
	}
	
	//Method to get contact details.
	public String getContact() {
	    String output = "Email Address: " + emailAddress;;
	    output += "Telephone Number: " + telephoneNumber;
	    return output;
	}
}
