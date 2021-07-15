package st12.eia.stream_collect_collector;

import java.util.Arrays;
import java.util.List;
						//necesario para ordenar los objetos de dicha clase.
public class MisEmpleadotes implements Comparable<MisEmpleadotes>{

	private long id;
	private String nombre;
	private double ingresos;
	private int edad;
	private Genero genero;
	
	public static enum Genero{
		HOMBRE, MUJER
	}

	public MisEmpleadotes(long id, String nombre, double ingresos, int edad, Genero genero) {
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
	
	public static List<MisEmpleadotes> listaMisEmpleados(){
		
		MisEmpleadotes emp1 = new MisEmpleadotes(1,"Juan Perez",538.00,26,Genero.HOMBRE);
		MisEmpleadotes emp2 = new MisEmpleadotes(1,"Alicia Ramirez",600.00,38,Genero.MUJER);
		MisEmpleadotes emp3 = new MisEmpleadotes(3,"Juan Puga",908.00,36,Genero.HOMBRE);
		MisEmpleadotes emp4 = new MisEmpleadotes(4,"Javier Vazquez",330.00,36,Genero.HOMBRE);
		MisEmpleadotes emp5 = new MisEmpleadotes(5,"Evelin López",450.00,36,Genero.MUJER);
		MisEmpleadotes emp6 = new MisEmpleadotes(6,"Esmeralda López",450.00,38,Genero.MUJER);
		MisEmpleadotes emp7 = new MisEmpleadotes(7,"Oyuki Navarro",600.00,36,Genero.MUJER);
		MisEmpleadotes emp8 = new MisEmpleadotes(8,"Álvaro Mejía",450.50,22,Genero.HOMBRE);
		MisEmpleadotes emp9 = new MisEmpleadotes(9,"Olivia uárez",652.30,35,Genero.MUJER);
		MisEmpleadotes emp10 = new MisEmpleadotes(10,"Jessica Quevedo",584.22,38,Genero.MUJER);
		MisEmpleadotes emp11 = new MisEmpleadotes(11,"Oswaldo Sánchez",789.36,43,Genero.HOMBRE);
		MisEmpleadotes emp12 = new MisEmpleadotes(12,"Oscar Pérez",155.79,45,Genero.HOMBRE);
		MisEmpleadotes emp13 = new MisEmpleadotes(13,"Lionel Messi",321.12,38,Genero.HOMBRE);
		MisEmpleadotes emp14 = new MisEmpleadotes(14,"Ricardo Kaká",796.36,32,Genero.HOMBRE);
		MisEmpleadotes emp15 = new MisEmpleadotes(15,"Cristiano Ronaldo",127.87,30,Genero.HOMBRE);
		MisEmpleadotes emp16 = new MisEmpleadotes(16,"Andrés Iniesta",798.23,33,Genero.HOMBRE);
		MisEmpleadotes emp17 = new MisEmpleadotes(17,"Eva Perón",613.25,40,Genero.MUJER);
		MisEmpleadotes emp18 = new MisEmpleadotes(18,"Margarita Zavala",321.54,45,Genero.MUJER);
		MisEmpleadotes emp19 = new MisEmpleadotes(19,"Josefina Vázquez",821.48,50,Genero.MUJER);
		MisEmpleadotes emp20 = new MisEmpleadotes(20,"Patricia Zetina",432.55,49,Genero.MUJER);
		MisEmpleadotes emp21 = new MisEmpleadotes(21,"Loammi Vazquez",158.26,30,Genero.MUJER);
		MisEmpleadotes emp22 = new MisEmpleadotes(22,"David Isaí",464.48,30,Genero.HOMBRE);
		MisEmpleadotes emp23 = new MisEmpleadotes(24,"Absalón Monerreal",125.45,20,Genero.HOMBRE);
		MisEmpleadotes emp24 = new MisEmpleadotes(25,"Ruth Sabiñon",215.12,22,Genero.MUJER);
		MisEmpleadotes emp25 = new MisEmpleadotes(26,"Lorenzo Arano",545.15,26,Genero.HOMBRE);
		MisEmpleadotes emp26 = new MisEmpleadotes(27,"Horacio Cervantes",145.54,45,Genero.HOMBRE);
		MisEmpleadotes emp27 = new MisEmpleadotes(28,"Julio Baista",558.45,24,Genero.HOMBRE);
		MisEmpleadotes emp28 = new MisEmpleadotes(29,"Edmundo Aguilar",876.15,38,Genero.HOMBRE);
		MisEmpleadotes emp29 = new MisEmpleadotes(30,"Angel Marquez",897.55,38,Genero.HOMBRE);
		MisEmpleadotes emp30 = new MisEmpleadotes(32,"Martha Sahagún",124.45,50,Genero.MUJER);
		MisEmpleadotes emp31 = new MisEmpleadotes(33,"Vicente Fox",515.45,60,Genero.HOMBRE);
		MisEmpleadotes emp32 = new MisEmpleadotes(34,"Roberto Pintado",287.54,59,Genero.HOMBRE);
		MisEmpleadotes emp33 = new MisEmpleadotes(35,"Alicia Villareal",872.54,45,Genero.MUJER);
		MisEmpleadotes emp34 = new MisEmpleadotes(36,"Lola Beltrán",245.77,26,Genero.MUJER);

		
		return Arrays.asList( emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, 
							 emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,	
							 emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30,
							 emp31, emp32, emp33, emp34);
				
	}

	@Override
	public int compareTo(MisEmpleadotes emp) {
		
		String nombreEmpleado = this.getNombre();
		
		int comparacionNombres = nombreEmpleado.compareTo(emp.getNombre());
		
		return comparacionNombres;
	}
	
}
