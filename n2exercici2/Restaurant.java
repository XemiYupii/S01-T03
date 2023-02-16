package n2exercici2;

import java.util.Objects;

public class Restaurant implements Comparable <Restaurant> {
	
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
	public int compareTo(Restaurant o) {
		int comparacio = nom.compareTo(o.getNom());
		return comparacio != 0 ? comparacio : Integer.compare(puntuacio, o.getPuntuacio());
	}
	@Override
	public String toString() {
		return nom + ": "+ puntuacio +" punts";
	}

	
}