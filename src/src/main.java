package src;

import java.util.Scanner;

public class main {
	
	public static Scanner scan = new Scanner(System.in);
	public static Gestion gestion = new Gestion();
	public static Etudiant etudiant = new Etudiant();
	public static Matiere matiere = new Matiere();
	
	public static void main(String[] args) {

		manage:
		while(true) {
			System.out.println("Options: ");
			System.out.println(" 1| Add student");
			System.out.println(" 2| Add subjects");
			System.out.println(" 3| Add notes");
			System.out.println(" 4| Add calculate subject moyenne");
			System.out.println(" 5| Add calculate student moyenne");
			System.out.println(" 6| Display Students");
			
            System.out.println("Enter your choice: ");
            int choice = scan.nextInt();
            
            switch(choice) {
            case 1: // Add student
            	System.out.println("Enter you student's name : ");
        		String name = scan.next();
        		etudiant = new Etudiant(name);
            	gestion.ajouterEtudiant(etudiant,name);
            	break;
            case 2: // Add notes subject
        		System.out.println("enter student name : ");
            	String stdNom = scan.next();
            	System.out.println("enter subject name : ");
            	String subNom = scan.next();
            	gestion.ajouterMatiere(subNom, stdNom);
            	break;
            case 3: // Add notes
            	System.out.println("Enter you student's name : ");
        		String nom = scan.next();
        		System.out.println("enter subject name : ");
            	String subName = scan.next();
            	System.out.println("enter how many notes you want add : ");
            	int numNote = scan.nextInt();
           		for(int i=0;i<numNote;i++) {
           			System.out.println("Enter note");
           			int note = scan.nextInt();
           			if(note<0 || note>20) {
           				System.out.println("note must be between 0 and 20");
           			}
           			else {
           				gestion.ajouterNote(nom, note,subName);
           			}
           		}
        		break;
            case 4: // Calculate subject moyenne
            	System.out.println("Enter your student name : ");
            	String n = scan.next();
            	System.out.println("Enter the subject name: ");
                String subject = scan.next();
                System.out.println(gestion.calculeMoyenne(n, subject));
                break;
            case 5: // Calculate Student moyenne
            	System.out.println("Enter your student name : ");
            	String no = scan.next();
            	gestion.calculeMoyenneGenerale(no);
            	break;
            case 6: // Display
            	gestion.afficherStudentsMatiereNote();
            	break;
            case 7: // Out
            	break manage;
            }
            
		}
		
		
	}

}
