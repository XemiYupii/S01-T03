package n1exercici1;

import java.util.Objects;

public class Month {
	
	private String name;
	
	public Month (String name) {
		this.name = name;
	}
	//Sobreescrivim els metodes HasCode i equals per assegurar-nos k el HashSet no contindrà elements duplicats
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Month))
			return false;
		Month mes = (Month) obj;
		return Objects.equals(name, mes.name);
	}

	public String toString() {
		return name;
	}

}
