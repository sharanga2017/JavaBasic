package org.serguei.tickets;


import java.util.*;
import java.util.List;

public class Stagiaire extends Personne {

	
	private boolean interne;
	
	
	
	
	public Stagiaire(String prenom, String nom, int age)  {
		super(prenom, nom, age);
	}
	
	public Stagiaire(String prenom, String nom, int age, boolean interne)  {
		super(prenom, nom, age);
		
		this.interne = interne;
	}

	public boolean isInterne() {
		return interne;
	}

	public void setInterne(boolean interne) {
		this.interne = interne;
	}
	
	
	

}
