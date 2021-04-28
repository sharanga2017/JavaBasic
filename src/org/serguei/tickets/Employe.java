package org.serguei.tickets;

public class Employe extends Personne {

	private String matricule;
	
	
	
	public String getMatricule() {
	
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Employe(String prenom, String nom, int age)  {
		super(prenom, nom, age);
	}
	
	public Employe(String prenom, String nom, int age, String mat)  {
		this(prenom, nom, age);
		this.matricule = mat;
	}
	
	
	

}
