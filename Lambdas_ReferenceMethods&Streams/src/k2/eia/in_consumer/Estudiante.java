package k2.eia.in_consumer;

public class Estudiante {

	private String nombre;
	private double calificacion;

	public Estudiante(String nombre, double calificacion) {
		super();
		this.nombre = nombre;
		this.calificacion = calificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}
