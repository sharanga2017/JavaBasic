package org.serguei.tickets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.serguei.tickets.service.LaCaisse;

public class GestionTickets {

	

	public static void main(String[] args) {
	
		
		Personne pers1 = new Stagiaire("Peire", "Khan", 34);
		LaCaisse.VendreTicket(pers1);
		
		
		Personne pers2 = new Employe("Frank", "Marshall", 34);
		LaCaisse.VendreTicket(pers2);
		
		
		List<Personne> personnes = new ArrayList<Personne>();
		
		personnes.add(pers2);
		
		personnes.add(pers1);
		
		
		for (Personne personne : personnes) {
			
			for (Ticket tick : personne.getListTickets()) {	
				
				System.out.println(tick.price);
			}
		}
		

	}
	
	
	
	

}
