package p2.eia.in_compartor;

import java.util.Date;

public class Persona implements Comparable<Persona> {

	private int idPersona;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona() {super();}

	public Persona(int idPersona, String nombre, String apellido, int edad) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido=apellido;
		this.edad=edad;
	}
	
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {

		return String.format("persona {idPersona: %1s, nombre: %2s , apellido: %3s}", idPersona, nombre, apellido);
	}

	@Override
	public int compareTo(Persona persona) {

		return this.nombre.compareTo(persona.nombre); 
	}
	
	
	
}
