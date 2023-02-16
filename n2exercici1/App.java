package n2exercici1;

import java.util.HashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Set<Restaurant>restaurants = new HashSet<>();
		
		//Introduïm diferents restaurants incluint un amb el mateix nom i diferent puntuació
		restaurants.add(new Restaurant ("Tagliatella", 10));
		restaurants.add(new Restaurant ("Tagliatella", 7));
		restaurants.add(new Restaurant ("Pans",3));
		restaurants.add(new Restaurant ("Casa àvia", 8));
		
		for (Restaurant restaurant : restaurants) {
			System.out.println(restaurant);
		}
		
		//Introduim un restaurant amb el mateix nom i mateixa puntuacio per comprobar que no l'introdueix en el Set
		restaurants.add(new Restaurant("Tagliatella", 10));
		
		for (Restaurant restaurant : restaurants) {
			System.out.println(restaurant);
		}
	}

}
