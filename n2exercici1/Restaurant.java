package n2exercici1;

import java.util.Objects;

public class Restaurant {
	
	private String nom;
	private int puntuacio;
	
	public Restaurant (String nom, int puntuacio) {
		this.nom = nom;
		this.puntuacio = puntuacio;
	}

	public String getNom() {
		return nom;
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom, puntuacio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Restaurant))
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(nom, other.nom) && puntuacio == other.puntuacio;
	}

	@Override
	public String toString() {
		return nom + ": "+ puntuacio +" punts";
	}
	
}