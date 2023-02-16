package n3exercici1;

public class Persona {
	
	private String nom;
	private String cognoms;
	private String dni;
	
	public Persona (String nom, String cognoms, String dni) {
		this.nom = nom;
		this.cognoms = cognoms;
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public String getCognoms() {
		return cognoms;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return nom+"  "+cognoms+"  "+dni;
	}
	

}
