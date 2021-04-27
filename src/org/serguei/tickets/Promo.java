package org.serguei.tickets;

import java.util.List;

public enum Promo {
	
	CDA(1), DWWM(2), CRCD(3);
	
	public int promo;
	 Promo(int promo ) {
		this.promo = promo;
	}
	
	private List<Personne> CDAlist;
	
	private List<Personne> DWWMList;
	private List<Personne> CRCDList;

}
