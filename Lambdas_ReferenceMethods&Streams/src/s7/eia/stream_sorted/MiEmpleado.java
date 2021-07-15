package s7.eia.stream_sorted;

import java.util.Arrays;
import java.util.List;
						//necesario para ordenar los objetos de dicha clase.
public class MiEmpleado implements Comparable<MiEmpleado>{

	private long id;
	private String nombre;
	private double ingresos;
	private int edad;
	private Genero genero;
	
	public static enum Genero{
		HOMBRE, MUJER
	}

	public MiEmpleado(long id, String nombre, double ingresos, int edad, Genero genero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ingresos = ingresos;
		this.edad = edad;
		this.genero = genero;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public boolean esHombre() {
		return this.genero == Genero.HOMBRE;
	}
	
	public boolean esMujer() {
		return this.genero == Genero.MUJER;
	}
	
	public static List<MiEmpleado> listaMisEmpleados(){
		
		MiEmpleado emp1 = new MiEmpleado(1,"Juan Perez",538.00,26,Genero.HOMBRE);
		MiEmpleado emp2 = new MiEmpleado(1,"Alicia Ramirez",600.00,38,Genero.MUJER);
		MiEmpleado emp3 = new MiEmpleado(3,"Juan Puga",908.00,36,Genero.HOMBRE);
		MiEmpleado emp4 = new MiEmpleado(4,"Javier Vazquez",330.00,36,Genero.HOMBRE);
		MiEmpleado emp5 = new MiEmpleado(5,"Evelin López",450.00,36,Genero.MUJER);
		MiEmpleado emp6 = new MiEmpleado(6,"Esmeralda López",450.00,38,Genero.MUJER);
		MiEmpleado emp7 = new MiEmpleado(7,"Oyuki Navarro",600.00,36,Genero.MUJER);
		MiEmpleado emp8 = new MiEmpleado(8,"Álvaro Mejía",450.50,22,Genero.HOMBRE);
		MiEmpleado emp9 = new MiEmpleado(9,"Olivia uárez",652.30,35,Genero.MUJER);
		MiEmpleado emp10 = new MiEmpleado(10,"Jessica Quevedo",584.22,38,Genero.MUJER);
		MiEmpleado emp11 = new MiEmpleado(11,"Oswaldo Sánchez",789.36,43,Genero.HOMBRE);
		MiEmpleado emp12 = new MiEmpleado(12,"Oscar Pérez",155.79,45,Genero.HOMBRE);
		MiEmpleado emp13 = new MiEmpleado(13,"Lionel Messi",321.12,38,Genero.HOMBRE);
		MiEmpleado emp14 = new MiEmpleado(14,"Ricardo Kaká",796.36,32,Genero.HOMBRE);
		MiEmpleado emp15 = new MiEmpleado(15,"Cristiano Ronaldo",127.87,30,Genero.HOMBRE);
		MiEmpleado emp16 = new MiEmpleado(16,"Andrés Iniesta",798.23,33,Genero.HOMBRE);
		MiEmpleado emp17 = new MiEmpleado(17,"Eva Perón",613.25,40,Genero.MUJER);
		MiEmpleado emp18 = new MiEmpleado(18,"Margarita Zavala",321.54,45,Genero.MUJER);
		MiEmpleado emp19 = new MiEmpleado(19,"Josefina Vázquez",821.48,50,Genero.MUJER);
		MiEmpleado emp20 = new MiEmpleado(20,"Patricia Zetina",432.55,49,Genero.MUJER);
		MiEmpleado emp21 = new MiEmpleado(21,"Loammi Vazquez",158.26,30,Genero.MUJER);
		MiEmpleado emp22 = new MiEmpleado(22,"David Isaí",464.48,30,Genero.HOMBRE);
		MiEmpleado emp23 = new MiEmpleado(24,"Absalón Monerreal",125.45,20,Genero.HOMBRE);
		MiEmpleado emp24 = new MiEmpleado(25,"Ruth Sabiñon",215.12,22,Genero.MUJER);
		MiEmpleado emp25 = new MiEmpleado(26,"Lorenzo Arano",545.15,26,Genero.HOMBRE);
		MiEmpleado emp26 = new MiEmpleado(27,"Horacio Cervantes",145.54,45,Genero.HOMBRE);
		MiEmpleado emp27 = new MiEmpleado(28,"Julio Baista",558.45,24,Genero.HOMBRE);
		MiEmpleado emp28 = new MiEmpleado(29,"Edmundo Aguilar",876.15,38,Genero.HOMBRE);
		MiEmpleado emp29 = new MiEmpleado(30,"Angel Marquez",897.55,38,Genero.HOMBRE);
		MiEmpleado emp30 = new MiEmpleado(32,"Martha Sahagún",124.45,50,Genero.MUJER);
		MiEmpleado emp31 = new MiEmpleado(33,"Vicente Fox",515.45,60,Genero.HOMBRE);
		MiEmpleado emp32 = new MiEmpleado(34,"Roberto Pintado",287.54,59,Genero.HOMBRE);
		MiEmpleado emp33 = new MiEmpleado(35,"Alicia Villareal",872.54,45,Genero.MUJER);
		MiEmpleado emp34 = new MiEmpleado(36,"Lola Beltrán",245.77,26,Genero.MUJER);

		
		return Arrays.asList( emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, 
							 emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,	
							 emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30,
							 emp31, emp32, emp33, emp34);
				
	}

	@Override
	public int compareTo(MiEmpleado emp) {
		
		String nombreEmpleado = this.getNombre();
		
		int comparacionNombres = nombreEmpleado.compareTo(emp.getNombre());
		
		return comparacionNombres;
	}
	
}
