package src;

import java.util.ArrayList;
import java.util.HashMap;

public class Matiere {

	private String name;
	ArrayList<Integer> notes = new ArrayList<>();
	
	public Matiere() {
		
	}

	public Matiere(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getNotes() {
		return notes;
	}

	public void setNote(int note) {
		notes.add(note);
	}

	@Override
	public String toString() {
		return "Matiere [name=" + name + "]";
	}
	
	
}
