package com.ecole.tp;

public class Etudiant {
	private static int compteur = 0;
	private final int id;
	private String nom;
	private String prenom;
	private double[] notes;
	private int nbNotes;
	private Filiere filiere;

	public Etudiant(String nom, String prenom) {
		this.id = ++compteur;
		this.nom = nom;
		this.prenom = prenom;
		this.notes = new double[5];
		this.nbNotes = 0;
	}

	public void ajouterNote(double note) {
		if (nbNotes == notes.length) {
			double[] tmp = new double[notes.length * 2];
			System.arraycopy(notes, 0, tmp, 0, notes.length);
			notes = tmp;
		}
		notes[nbNotes++] = note;
	}

	public double calculerMoyenne() {
		if (nbNotes == 0)
			return 0.0;
		double somme = 0;
		for (int i = 0; i < nbNotes; i++) {
			somme += notes[i];
		}
		return somme / nbNotes;
	}

	public void afficherNotes() {
		System.out.print("Notes de " + nom + " " + prenom + " : ");
		for (int i = 0; i < nbNotes; i++) {
			System.out.print(notes[i]);
			if (i < nbNotes - 1)
				System.out.print(", ");
		}
		System.out.println();
	}

	public void setFiliere(Filiere f) {
		this.filiere = f;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	@Override
	public String toString() {
		String fil = (filiere != null) ? filiere.getNom() : "Aucune";
		return "Étudiant[id=" + id + ", nom=" + nom + ", prénom=" + prenom + ", filière=" + fil + ", moyenne=" + String.format("%.2f", calculerMoyenne())+"]";
	}
}
