package p2.eia.in_compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compartor_MainTest {

	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		listaPersonas.add(new Persona(4,"Juan","Becker",17));
		listaPersonas.add(new Persona(2,"Fernando","Guzmán",20));
		listaPersonas.add(new Persona(1,"Mario","Hernández",16));
		listaPersonas.add(new Persona(3,"Omar","Chaparro",19));
		
		
	System.out.println("Lista de Personas Sin Ordenar.");
		
		for (Persona p: listaPersonas) {
			System.out.println("Nombre: " + p.getNombre() + " -id-: " + p.getIdPersona());
		}
		
		System.out.println("\n");
		Collections.sort(listaPersonas);
		
		
	System.out.println("Lista de Personas Ordenadas por Nombre.");
		for (Persona po: listaPersonas) {
		System.out.println("Nombre: " + po.getNombre());
		}
		
		
		System.out.println("\n");
		OrdenarPersonaPorId personaId = new OrdenarPersonaPorId();
		
		//Sintaxis .sort(Lista<T>, obj que contenga la interfaz Comparator) 
		Collections.sort(listaPersonas, personaId);
		 
		
	System.out.println("Lista de Personas Ordenadas por Id.");
		
		for (Persona pId: listaPersonas) {
		System.out.println("Id: " + pId.getIdPersona() + " Nombre: " + pId.getNombre());
		}
		
		
		System.out.println("\n");
		OrdenarPersonaPorApellido personaApe = new OrdenarPersonaPorApellido();
		
		//Sintaxis .sort(Lista<T>, obj que contenga la interfaz Comparator) 
		Collections.sort(listaPersonas, personaApe);
		 
		
	System.out.println("Lista de Personas Ordenadas por Apellido.");
		
		for (Persona pApellido: listaPersonas) {
		System.out.println("Apellido: " + pApellido.getApellido() + " Nombre: " + pApellido.getNombre());
		}
	
		System.out.println("\n");
		
	System.out.println("Lista de Personas Ordenadas por Edad - Utilizando Lambdas -.");
		
		Comparator<Persona> comparadorPorEdad = (perEdad1,perEdad2)->perEdad1.getEdad()-perEdad2.getEdad();
		Collections.sort(listaPersonas,comparadorPorEdad);
		
		for (Persona persona: listaPersonas) {
		System.out.println("Edad:" + persona.getEdad() +" id: " + persona.getIdPersona() +  " Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido());
		}
	}
}
