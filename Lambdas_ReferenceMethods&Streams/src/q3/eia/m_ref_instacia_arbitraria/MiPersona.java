package q3.eia.m_ref_instacia_arbitraria;

import java.util.Comparator;

public class MiPersona {

	private String nombre;
	private Integer edad;
	private String email;
	private Integer salario;
	
	public MiPersona() {super();}

	public MiPersona(String nombre, int edad, String email, int salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
		this.salario=salario;
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
	
	

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	
	@Override
	public String toString() {
		return "MiPersona [nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", salario=" + salario + "]";
	}

	public static int compararPorEdad(MiPersona a, MiPersona b) {
		
		Integer edadPersonaA = a.getEdad();
		Integer edadPersonaB = b.getEdad();
		
		return edadPersonaA.compareTo(edadPersonaB);
	}
	
	public int compararPorSalario (MiPersona per) {
		return this.getSalario().compareTo(per.getSalario());
	}
	
	
	
}
