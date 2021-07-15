package st11.eia.stream_collect;

import java.util.Arrays;
import java.util.List;
						//necesario para ordenar los objetos de dicha clase.
public class MisEmployees implements Comparable<MisEmployees>{

	private long id;
	private String nombre;
	private double ingresos;
	private int edad;
	private Genero genero;
	
	public static enum Genero{
		HOMBRE, MUJER
	}

	public MisEmployees(long id, String nombre, double ingresos, int edad, Genero genero) {
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
	
	public static List<MisEmployees> listaMisEmpleados(){
		
		MisEmployees emp1 = new MisEmployees(1,"Juan Perez",538.00,26,Genero.HOMBRE);
		MisEmployees emp2 = new MisEmployees(1,"Alicia Ramirez",600.00,38,Genero.MUJER);
		MisEmployees emp3 = new MisEmployees(3,"Juan Puga",908.00,36,Genero.HOMBRE);
		MisEmployees emp4 = new MisEmployees(4,"Javier Vazquez",330.00,36,Genero.HOMBRE);
		MisEmployees emp5 = new MisEmployees(5,"Evelin López",450.00,36,Genero.MUJER);
		MisEmployees emp6 = new MisEmployees(6,"Esmeralda López",450.00,38,Genero.MUJER);
		MisEmployees emp7 = new MisEmployees(7,"Oyuki Navarro",600.00,36,Genero.MUJER);
		MisEmployees emp8 = new MisEmployees(8,"Álvaro Mejía",450.50,22,Genero.HOMBRE);
		MisEmployees emp9 = new MisEmployees(9,"Olivia uárez",652.30,35,Genero.MUJER);
		MisEmployees emp10 = new MisEmployees(10,"Jessica Quevedo",584.22,38,Genero.MUJER);
		MisEmployees emp11 = new MisEmployees(11,"Oswaldo Sánchez",789.36,43,Genero.HOMBRE);
		MisEmployees emp12 = new MisEmployees(12,"Oscar Pérez",155.79,45,Genero.HOMBRE);
		MisEmployees emp13 = new MisEmployees(13,"Lionel Messi",321.12,38,Genero.HOMBRE);
		MisEmployees emp14 = new MisEmployees(14,"Ricardo Kaká",796.36,32,Genero.HOMBRE);
		MisEmployees emp15 = new MisEmployees(15,"Cristiano Ronaldo",127.87,30,Genero.HOMBRE);
		MisEmployees emp16 = new MisEmployees(16,"Andrés Iniesta",798.23,33,Genero.HOMBRE);
		MisEmployees emp17 = new MisEmployees(17,"Eva Perón",613.25,40,Genero.MUJER);
		MisEmployees emp18 = new MisEmployees(18,"Margarita Zavala",321.54,45,Genero.MUJER);
		MisEmployees emp19 = new MisEmployees(19,"Josefina Vázquez",821.48,50,Genero.MUJER);
		MisEmployees emp20 = new MisEmployees(20,"Patricia Zetina",432.55,49,Genero.MUJER);
		MisEmployees emp21 = new MisEmployees(21,"Loammi Vazquez",158.26,30,Genero.MUJER);
		MisEmployees emp22 = new MisEmployees(22,"David Isaí",464.48,30,Genero.HOMBRE);
		MisEmployees emp23 = new MisEmployees(24,"Absalón Monerreal",125.45,20,Genero.HOMBRE);
		MisEmployees emp24 = new MisEmployees(25,"Ruth Sabiñon",215.12,22,Genero.MUJER);
		MisEmployees emp25 = new MisEmployees(26,"Lorenzo Arano",545.15,26,Genero.HOMBRE);
		MisEmployees emp26 = new MisEmployees(27,"Horacio Cervantes",145.54,45,Genero.HOMBRE);
		MisEmployees emp27 = new MisEmployees(28,"Julio Baista",558.45,24,Genero.HOMBRE);
		MisEmployees emp28 = new MisEmployees(29,"Edmundo Aguilar",876.15,38,Genero.HOMBRE);
		MisEmployees emp29 = new MisEmployees(30,"Angel Marquez",897.55,38,Genero.HOMBRE);
		MisEmployees emp30 = new MisEmployees(32,"Martha Sahagún",124.45,50,Genero.MUJER);
		MisEmployees emp31 = new MisEmployees(33,"Vicente Fox",515.45,60,Genero.HOMBRE);
		MisEmployees emp32 = new MisEmployees(34,"Roberto Pintado",287.54,59,Genero.HOMBRE);
		MisEmployees emp33 = new MisEmployees(35,"Alicia Villareal",872.54,45,Genero.MUJER);
		MisEmployees emp34 = new MisEmployees(36,"Lola Beltrán",245.77,26,Genero.MUJER);

		
		return Arrays.asList( emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, 
							 emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,	
							 emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30,
							 emp31, emp32, emp33, emp34);
				
	}

	@Override
	public int compareTo(MisEmployees emp) {
		
		String nombreEmpleado = this.getNombre();
		
		int comparacionNombres = nombreEmpleado.compareTo(emp.getNombre());
		
		return comparacionNombres;
	}
	
}
