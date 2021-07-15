package s1.eia.stream_intstream;

public class Estudiante {

	private String identficiacion;
	private int edad;
	private double altura;
	private double promedio;

	public Estudiante(String identficiacion, int edad, double altura, double promedio) {
		super();
		this.identficiacion = identficiacion;
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

}
