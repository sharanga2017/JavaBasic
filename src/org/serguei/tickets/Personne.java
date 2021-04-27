package org.serguei.tickets;

import java.util.ArrayList;
import java.util.List;

public abstract class Personne {
	
	private String prenom;
	
	private String nom;
	
	private int age;
	
	
	private List<Ticket> listTickets =  new ArrayList<Ticket>();
	
	public Personne(String prenom, String nom, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
	
	
	
	
	
	public void  addTicket(Ticket ticket) {
		listTickets.add(ticket);
	}

	public List<Ticket> getListTickets() {
		return listTickets;
	}




	public void setListtickets(List<Ticket> listtickets) {
		this.listTickets = listtickets;
	}




	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
