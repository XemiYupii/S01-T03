package exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;


public class App {

	public static void main(String[] args) {

		List <Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		
		List <Integer> ordreInvers= new ArrayList<>();
		//Creem un ListIterator i el posicionem a la última posicio de la llista numeros
		ListIterator <Integer> listIt = numeros.listIterator(10);
		
		while(listIt.hasPrevious()) {
			ordreInvers.add(listIt.previous());
		}
		//S'han afegit els elements de la llista numeros a la llista ordreInvers en ordre descendent
		System.out.println(ordreInvers);
		
	}

}
