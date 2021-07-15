package p2.eia.in_compartor;

import java.util.Comparator;

public class OrdenarPersonaPorApellido implements Comparator<Persona> {

	@Override
	public int compare(Persona per1, Persona per2) {
		
		String apellidoPersona1 = per1.getApellido();
		String apellidoPersona2 = per2.getApellido();
		
		return apellidoPersona1.compareTo(apellidoPersona2);
	}

}
/**
El método compare() entrega un num entero neg si el primer argumento es menor al segundo
					 entrega un cero primer argumento es igual al segundo
					 entrega un num entero pos primer argumento es mayor al segundo
* */