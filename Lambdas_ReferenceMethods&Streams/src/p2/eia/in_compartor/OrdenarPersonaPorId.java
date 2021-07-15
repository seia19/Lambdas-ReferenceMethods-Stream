package p2.eia.in_compartor;

import java.util.Comparator;

public class OrdenarPersonaPorId implements Comparator<Persona>{

	@Override
	public int compare(Persona per1, Persona per2) {

		return per1.getIdPersona() - per2.getIdPersona();
		
		/**
		 el método compare() entrega un num entero neg si el primer argumento es menor al segundo
		 					 entrega un cero primer argumento es igual al segundo
		 					 entrega un num entero pos primer argumento es mayor al segundo
		 * */
	}

}
