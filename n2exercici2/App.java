package n2exercici2;

import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		Set<Restaurant>restaurants = new TreeSet<>();
		
		
		restaurants.add(new Restaurant ("Tagliatella", 10));
		restaurants.add(new Restaurant ("Tagliatella", 7));
		restaurants.add(new Restaurant ("Pans",3));
		restaurants.add(new Restaurant ("Casa àvia", 8));
		
		restaurants.forEach(System.out::println);
		
	}

}
