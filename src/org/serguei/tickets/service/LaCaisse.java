package org.serguei.tickets.service;

import org.serguei.tickets.Employe;
import org.serguei.tickets.Personne;
import org.serguei.tickets.Stagiaire;
import org.serguei.tickets.Ticket;

public class LaCaisse {
	
	
public static void VendreTicket(Personne personne) {
		
		
		if( personne instanceof Employe) {
			
			Ticket tickStagiaire = Ticket.EMPLOYE;
			tickStagiaire.price = 1.5f;
			personne.getListTickets().add(tickStagiaire);
			
			
		}
		
		else if (personne instanceof Stagiaire)
		{
			Ticket tickStagiaire = Ticket.STAGIAIRE;
			tickStagiaire.price = 3f;
			personne.getListTickets().add(tickStagiaire);
			
			
		}
	}

}
