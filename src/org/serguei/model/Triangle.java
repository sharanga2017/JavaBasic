package org.serguei.model;

public class Triangle {
	
	private int base;
	
	
	private int hauteur;
	
	private double aire;
	
	
	
	public Triangle(int base, int hauteur) {
		this.base = base;
		this.hauteur = hauteur;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public double getAire() {
		return base*hauteur/2;
	}

	public void setAire(double aire) {
		this.aire = aire;
	}
	
	
	

}
