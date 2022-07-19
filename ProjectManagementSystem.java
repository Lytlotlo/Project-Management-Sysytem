import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;

public class ProjectManagementSystem {
	public static void main(String[] args) {
		//Call scanner function to input data.
		Scanner input = new Scanner(System.in);

		//List of the projects
		List<ProjectObject> projectList = new ArrayList<ProjectObject>();

		//List of the persons 
		List<Person> personList = new ArrayList<Person>();
		
		//Instruction to user. User enters s to start the program.
		System.out.println("Enter s to start program.");
		
		//Start program using the input function.
		char start = input.next().charAt(0);  

		
		while (start == 's') {
			System.out.println("a - Capture project details.\nb - Change due date.\nc - Change total amount.\nd - Update constructors details.\ne - Finalise project.\nq - quit");
			char menu = input.next().charAt(0);  
			//Capture project details.
			if (menu == 'a') {
				System.out.println("Enter project number.");
				int projectNumber = input.nextInt();
				System.out.println("Enter project name.");
				String projectName = input.nextLine();
				System.out.println("Enter building type.");
				String buildingType = input.nextLine();
				System.out.println("Enter project address.");
			    String projectAddress = input.nextLine();
			    System.out.println("Enter ERF number.");
				int erfNumber = input.nextInt();
				System.out.println("Enter project fee.");
				int projectFee = input.nextInt();
				System.out.println("Enter total amount.");
				int totalAmount = input.nextInt();
				System.out.println("Enter deadline in the format YYYY/MM/DD.");
				String deadline = input.nextLine();
				ProjectObject object = new ProjectObject(projectNumber, projectName, buildingType, projectAddress, erfNumber, projectFee, totalAmount, deadline);
				projectList.add(object);
				System.out.println("Project added.");
			}
            //Change due date.
			else if (menu == 'b') {
				System.out.println("Enter project number.");
				int projectNumber = input.nextInt();
				for (int i = 0; i < projectList.size(); i++) {
					if (projectNumber == projectList.get(i).getProject()) {
						projectList.get(i).dueDate();
					}	
				}
			}
            //Change total amount paid.
			else if (menu == 'c') {
				System.out.println("Enter project number.");
				int projectNumber = input.nextInt();
				for (int i = 0; i < projectList.size(); i++) {
					if (projectNumber == projectList.get(i).getProject()) {
						projectList.get(i).changeTotal();
                    }
				}
			}
            //Update contact.
			else if (menu == 'd') {
				System.out.println("Enter persons name.");
				String personsName = input.nextLine();
				for (int i = 0; i < personList.size(); i++) {
					if (personsName == personList.get(i).getName()) {
						personList.get(i).updateContact();
					}
				}
			}
			//Get invoice.
			else if (menu == 'e') {
				System.out.println("Enter project number.");
				int projectNumber = input.nextInt();
				for (int i = 0; i < projectList.size(); i++) {
				    if (projectNumber == projectList.get(i).getProject()) {
				    	if (projectList.get(i).getProjectFee() != projectList.get(i).getTotalAmount()) {
				    		System.out.println(personList.get(i).getContact()); 	
				    		int invoice = projectList.get(i).getProjectFee() - projectList.get(i).getTotalAmount();
				    		System.out.println("Amount due:" + invoice);
				    	}
				     }
			    }
			}
			//Quit program.
			else if (menu == 'q'){
				System.out.println("Goodbye.");
				break;
			}
		}
	}
}