package exercici1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		
		List <Month> mesosAny = new ArrayList<>();
		
		mesosAny.add(new Month ("Gener"));
		mesosAny.add(new Month ("Febrer"));
		mesosAny.add(new Month ("Març"));
		mesosAny.add(new Month ("Abril"));
		mesosAny.add(new Month ("Maig"));
		mesosAny.add(new Month ("Juny"));
		mesosAny.add(new Month ("Juliol"));
		mesosAny.add(new Month ("Setembre"));
		mesosAny.add(new Month ("Octubre"));
		mesosAny.add(new Month ("Novembre"));
		mesosAny.add(new Month ("Decembre"));
		
		//S'imprimeix la llista en el orde k hem afegit els elements
		System.out.println(mesosAny);
		//Afegim el mes d'Agost a la posició 7 e imprimim la llista per veure k s'ha incluit corectament
		mesosAny.add(7, new Month ("Agost"));
		System.out.println(mesosAny);
		//Creem un HashSet e incluim els elements de l'ArrayList
		Set <Month> mesosAny2 = new HashSet<>(mesosAny);
		//Intentem tornar a incluir el mes d'Agost i recorrem la llista amb un for each i amb un iterador
		mesosAny2.add(new Month ("Agost"));
		for (Month month : mesosAny2) {
			System.out.println(month);
		}
		Iterator <Month> it = mesosAny2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+ "   iterator");
		}
	}

}
