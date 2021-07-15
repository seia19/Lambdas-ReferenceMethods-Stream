package s5.eia.stream_filter;

import java.util.Arrays;
import java.util.List;

public class Employee {

	private long id;
	private String nombre;
	private double ingresos;
	private int edad;
	private Genero genero;
	
	public static enum Genero{
		HOMBRE, MUJER
	}

	public Employee(long id, String nombre, double ingresos, int edad, Genero genero) {
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
	
	public static List<Employee> listaEmpleados(){
		
		Employee emp1 = new Employee(1,"Juan Perez",538.00,26,Genero.HOMBRE);
		Employee emp2 = new Employee(1,"Alicia Ramirez",600.00,38,Genero.MUJER);
		Employee emp3 = new Employee(3,"Juan Puga",908.00,36,Genero.HOMBRE);
		Employee emp4 = new Employee(4,"Javier Vazquez",330.00,36,Genero.HOMBRE);
		Employee emp5 = new Employee(5,"Evelin López",450.00,36,Genero.MUJER);
		Employee emp6 = new Employee(6,"Esmeralda López",450.00,38,Genero.MUJER);
		Employee emp7 = new Employee(7,"Oyuki Navarro",600.00,36,Genero.MUJER);
		Employee emp8 = new Employee(8,"Álvaro Mejía",450.50,22,Genero.HOMBRE);
		Employee emp9 = new Employee(9,"Olivia uárez",652.30,35,Genero.MUJER);
		Employee emp10 = new Employee(10,"Jessica Quevedo",584.22,38,Genero.MUJER);
		Employee emp11 = new Employee(11,"Oswaldo Sánchez",789.36,43,Genero.HOMBRE);
		Employee emp12 = new Employee(12,"Oscar Pérez",155.79,45,Genero.HOMBRE);
		Employee emp13 = new Employee(13,"Lionel Messi",321.12,38,Genero.HOMBRE);
		Employee emp14 = new Employee(14,"Ricardo Kaká",796.36,32,Genero.HOMBRE);
		Employee emp15 = new Employee(15,"Cristiano Ronaldo",127.87,30,Genero.HOMBRE);
		Employee emp16 = new Employee(16,"Andrés Iniesta",798.23,33,Genero.HOMBRE);
		Employee emp17 = new Employee(17,"Eva Perón",613.25,40,Genero.MUJER);
		Employee emp18 = new Employee(18,"Margarita Zavala",321.54,45,Genero.MUJER);
		Employee emp19 = new Employee(19,"Josefina Vázquez",821.48,50,Genero.MUJER);
		Employee emp20 = new Employee(20,"Patricia Zetina",432.55,49,Genero.MUJER);
		Employee emp21 = new Employee(21,"Loammi Vazquez",158.26,30,Genero.MUJER);
		Employee emp22 = new Employee(22,"David Isaí",464.48,30,Genero.HOMBRE);
		Employee emp23 = new Employee(24,"Absalón Monerreal",125.45,20,Genero.HOMBRE);
		Employee emp24 = new Employee(25,"Ruth Sabiñon",215.12,22,Genero.MUJER);
		Employee emp25 = new Employee(26,"Lorenzo Arano",545.15,26,Genero.HOMBRE);
		Employee emp26 = new Employee(27,"Horacio Cervantes",145.54,45,Genero.HOMBRE);
		Employee emp27 = new Employee(28,"Julio Baista",558.45,24,Genero.HOMBRE);
		Employee emp28 = new Employee(29,"Edmundo Aguilar",876.15,38,Genero.HOMBRE);
		Employee emp29 = new Employee(30,"Angel Marquez",897.55,38,Genero.HOMBRE);
		Employee emp30 = new Employee(32,"Martha Sahagún",124.45,50,Genero.MUJER);
		Employee emp31 = new Employee(33,"Vicente Fox",515.45,60,Genero.HOMBRE);
		Employee emp32 = new Employee(34,"Roberto Pintado",287.54,59,Genero.HOMBRE);
		Employee emp33 = new Employee(35,"Alicia Villareal",872.54,45,Genero.MUJER);
		Employee emp34 = new Employee(36,"Lola Beltrán",245.77,26,Genero.MUJER);

		
		return Arrays.asList( emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, 
							 emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,	
							 emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30,
							 emp31, emp32, emp33, emp34);
				
	}
	
}
