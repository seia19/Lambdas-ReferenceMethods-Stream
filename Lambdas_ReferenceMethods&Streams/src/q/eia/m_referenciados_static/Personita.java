package q.eia.m_referenciados_static;

import java.util.Comparator;

public class Personita {

	private String nombre;
	private Integer edad;
	private String email;
	
	public Personita() {super();}

	public Personita(String nombre, int edad, String email) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	@Override
	public String toString() {
		return "Personita [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
	}

	
	public static int compararPorEdad(Personita a, Personita b) {
		
		Integer edadPersonaA = a.getEdad();
		Integer edadPersonaB = b.getEdad();
		
		return edadPersonaA.compareTo(edadPersonaB);
	}
	
	
	
}
