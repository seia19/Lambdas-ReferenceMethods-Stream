package s3.eia.stream_colecciones;

public class MiEstudiante {

	private String identficiacion;
	private String nombre;
	private int edad;
	private double altura;
	private double promedio;

	public MiEstudiante(String identficiacion, String nombre, int edad, double altura, double promedio) {
		super();
		this.identficiacion = identficiacion;
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.promedio = promedio;
	}

	public String getIdentficiacion() {
		return identficiacion;
	}

	public void setIdentficiacion(String identficiacion) {
		this.identficiacion = identficiacion;
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

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "MiEstudiante [identficiacion=" + identficiacion + ", nombre=" + nombre + ", edad=" + edad + ", altura="
				+ altura + ", promedio=" + promedio + "]";
	}
	
	

}
