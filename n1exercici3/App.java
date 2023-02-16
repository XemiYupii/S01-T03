package n1exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class App {
private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		Map <String, String> countries = new HashMap<>();

		try {
			llegirArtxiu (countries);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String nom = demanarNom("Escriu el teu nom");
		List <String> countriesKeys = new ArrayList<>(countries.keySet()); //instanciem una ArrayList amb les keys del HashMap
		String pais = agafarPaisAleatori(countriesKeys);
		int puntuacio = demanarCapitals (countriesKeys, "Escriu la capital de :", countries);
		try {
			guardarPuntuacio (nom, puntuacio);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void guardarPuntuacio(String nomUsuari, int puntuacioUsuari) throws IOException {
		try (BufferedWriter writer = new BufferedWriter ( new FileWriter("src/classificacio.txt", true))) {
			writer.write(nomUsuari +" " +puntuacioUsuari +" punts.\n");
		} catch (IOException e) {
			throw new IOException("Error al crear l'artxiu", e);
		}
	}
	public static Map<String, String> llegirArtxiu (Map<String, String> countries) throws IOException {
	    String linia;
	    String[] paisosCapitals;

	    try (BufferedReader reader = new BufferedReader(new FileReader("src/countries.txt"))) {
	        while ((linia = reader.readLine()) != null) {
	            paisosCapitals = linia.split(" ");
	            countries.put(paisosCapitals[0], paisosCapitals[1]);
	        }
	    } catch (IOException e) {
	        throw new IOException("Error al llegir l'artxiu", e);
	    }
	    return countries;
	}
	public static String demanarNom(String missatge) {
		System.out.println(missatge);
		return input.nextLine();
	}
	public static String agafarPaisAleatori (List<String> countriesKeys) {
		Random numAleatori = new Random ();                                                         //Creem un numero aleatori compres entre 0 i el tamany de l'ArrayList i lutilitzarem
		String pais = countriesKeys.get(numAleatori.nextInt(countriesKeys.size()));     // per agafar el pais k es troba en aklla posicio
		return pais;
	}
	public static int demanarCapitals (List<String> countriesKeys, String missatge, Map <String, String> paisosCapitals) {
		int puntuacio = 0;
		String resposta = "";
		String pregunta = "" ;
		System.out.println(missatge);
		for (int i = 0; i < 10; i++) {
			System.out.println( pregunta =  agafarPaisAleatori(countriesKeys));
			resposta = input.nextLine();
			if (resposta.equalsIgnoreCase(paisosCapitals.get(pregunta)))
				puntuacio ++;
		}
		return puntuacio;
	}

}
