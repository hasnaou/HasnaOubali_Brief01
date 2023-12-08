package src;

import java.util.ArrayList;
import java.util.HashMap;

public class Etudiant {

	private String name;
	ArrayList<Matiere> matieres = new ArrayList<>();
	
	public Etudiant() {
	}
	
	public Etudiant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(Matiere matiere) {
		matieres.add(matiere);
	}

	@Override
	public String toString() {
		return "Etudiant [name="+name+"]";
	}
	
	
}
