package src;

public interface GestionInterface {

	
	void ajouterEtudiant(Etudiant e, String name);
	void ajouterNote(String name, int note, String subName);
	int calculeMoyenne(String nom, String m);
	void afficherStudentsMatiereNote();

}
