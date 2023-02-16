package n3exercici1;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Persona>persones = new ArrayList<>();
		File fitxer = new File ("src/Persones.csv");
		
		try {
			menu(persones, fitxer);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	public static List<Persona>  introduirPersona (File fitxer, List<Persona>persones) throws IOException {
		String linia = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fitxer)));
		
		while ((linia = reader.readLine()) != null) {
			String [] atribut = linia.split(",");
			persones.add(new Persona(atribut [0], atribut [1], atribut[2]));
		}
		reader.close();                                                                    
		return persones;
	}
	public static void mostrarNomAZ (List<Persona>persones) {
		persones.sort(Comparator.comparing(Persona::getNom));
		persones.forEach(System.out::println);
	}
	public static void mostrarNomZA (List<Persona>persones) {
		persones.sort(Comparator.comparing(Persona::getNom).reversed());
		persones.forEach(System.out::println);
	}
	public static void mostrarCognomAZ (List<Persona>persones) {
		persones.sort(Comparator.comparing(Persona::getCognoms));
		persones.forEach(System.out::println);
	}
	public static void mostrarCognomZA (List<Persona>persones) {
		persones.sort(Comparator.comparing(Persona::getCognoms).reversed());
		persones.forEach(System.out::println);
	}
	public static void mostrarDniAscendent (List<Persona>persones) {
		persones.sort(Comparator.comparing(Persona::getDni));
		persones.forEach(System.out::println);
	}
	public static void mostrarDniDescendent (List<Persona>persones) {
		persones.sort(Comparator.comparing(Persona::getDni).reversed());
		persones.forEach(System.out::println);
	}
	public static void menu (List<Persona>persones, File fitxer) throws IOException {
		int opcio = 0;
		
		do {
			opcio = Entrada.llegirInt("Benvingut, escull una de les següents opcions:\n"
					+"1.- Introduir persona.\n"
					+"2.- Mostrar les persones ordenades per nom (A-Z).\n"
					+"3.- Mostrar les persones ordenades per nom (Z-A).\n"
					+"4.- Mostrar les persones ordenades per cognoms (A-Z).\n"
					+"5.- Mostrar les persones ordenades per cognoms (Z-A).\n"
					+"6.- Mostrar les persones ordenades per DNI (1-9).\n"
					+"7.- Mostrar les persones ordenades per DNI (9-1).\n"
					+"0.- Sortir.");
			while (opcio < 0 || opcio > 7) {
				opcio = Entrada.llegirInt("Opció incorrecte, torna-ho ha probar");
			}
			switch (opcio) {
				case 0:
					System.out.println("Gràcies per utilitzar la nostra App");
					break;
				case 1: 
					introduirPersona(fitxer, persones);
					break;
				case 2:
					mostrarNomAZ(persones);
					break;
				case 3:
					mostrarNomZA(persones);
					break;
				case 4:
					mostrarCognomAZ(persones);
					break;
				case 5:
					mostrarCognomZA(persones);
					break;
				case 6:
					mostrarDniAscendent(persones);
					break;
				case 7:
					mostrarDniDescendent(persones);
					break;
					default:
			}
		}while (opcio != 0);
	}

}
