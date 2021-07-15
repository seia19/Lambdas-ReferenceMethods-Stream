package h2.eia.in_predicate;

public class Empleado_emp {

	private String nombre;
	private int edad;
	private double salario;
	private String departamento;

	public Empleado_emp(String nombre, int edad, double salario, String departamento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.departamento = departamento;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
