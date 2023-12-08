package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Gestion implements GestionInterface{

	ArrayList<Etudiant> etudiants = new ArrayList<>();
	Matiere matiere = new Matiere();
	
	private Etudiant findEtudiantByName(String name) {		
        for (Etudiant e : etudiants) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }
	
	@Override
	public void ajouterEtudiant(Etudiant e, String name) {
		
		Etudiant studentExist = findEtudiantByName(name);

		if(studentExist != null) {
			System.out.println("already exist");
		}
		else {
			etudiants.add(e);
			System.out.println("ajouté avec succée");
		}
	}
	
	@Override
	public void ajouterNote(String name, int note, String subName) {
		
		Etudiant studentExist = findEtudiantByName(name);

		if(studentExist == null) {
	        System.out.println("Student not found !!");
	    } 
	    else {
	    	for(Etudiant e : etudiants) {
	    		if(e.getName().equals(name)) {
	    			for (Matiere matiere : e.getMatieres()) {
	    				if(matiere.getName().equals(subName)) {
	    					matiere.notes.add(note);
		    	    		System.out.println("note added");
	    				}
	    	        }
	    		}
	    	}
	    }
	}
	
	@Override
	public int calculeMoyenne(String name, String m) {
		
		Etudiant studentExist = findEtudiantByName(name);
		int moyenne=0;
		int sum=0;
		if (studentExist != null) {
            for(Etudiant e : etudiants) {
            	for(Matiere ma : e.matieres) {
            		if(ma.getName().equals(m)) {
            			ArrayList<Integer> notes = ma.getNotes();
                		for(Integer note : notes) {
                			sum +=note;
                		}
                		moyenne = sum/notes.size();
                		return moyenne;
            		}
            		else {
            			System.out.println("Subject not found !!");
            		}
            	}
            }
        }
		else {
			System.out.println("Student not found !!");
		}
		return moyenne;
    }
	
	public void calculeMoyenneGenerale(String name) {
		Etudiant studentExist = findEtudiantByName(name);
		int sum=0;
		int moyenneGeneral=0;
		if(studentExist != null) {
			for(Etudiant e : etudiants) {
				for(Matiere m : e.matieres) {
					ArrayList<Integer> notes = m.getNotes();
					for(Integer note : notes) {
						sum += note;
					}
					moyenneGeneral = sum/notes.size();
				}
				System.out.println("Le moyenne général est : "+moyenneGeneral);
			}
		}
		else {
			System.out.println("Student not found !!");
		}
	}
	
	public void afficherListeEtudiants() {
        System.out.println("Student list:");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getName());
        }
    }

	public void afficherStudentsMatiereNote() {
		for(Etudiant etudiant : etudiants) {
			for(Matiere matiere : etudiant.getMatieres()) {
				ArrayList<Integer> notes = matiere.getNotes();
				for(Integer note : notes) {
					System.out.println("Nom : "+etudiant.getName()+" Matiere : "+matiere.getName()+" Notes : "+note);
				}
			}
		}
	}
	
	public void ajouterMatiere(String subName, String stdName) {
		for(Etudiant e : etudiants) {
			if(e.getName().equals(stdName)) {
				Matiere m = new Matiere(subName);
				e.setMatieres(m);
	            System.out.println("subject ajouté avec succée");
	            for(Matiere ma:e.getMatieres()) {
	            	System.out.println(ma.getName());
	            }
			}
		}
	}
}
