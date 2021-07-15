package st13.eia.stream_reducc_map;

import java.util.Arrays;
import java.util.List;
						//necesario para ordenar los objetos de dicha clase.
public class EmpleadoPersonal implements Comparable<EmpleadoPersonal>{

	private long id;
	private String nombre;
	private double ingresos;
	private int edad;
	private Genero genero;
	
	public static enum Genero{
		HOMBRE, MUJER
	}

	public EmpleadoPersonal(long id, String nombre, double ingresos, int edad, Genero genero) {
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
	
	public static List<EmpleadoPersonal> listaMisEmpleadosPersonal(){
		
		EmpleadoPersonal emp1 = new EmpleadoPersonal(1,"Juan Perez",538.00,26,Genero.HOMBRE);
		EmpleadoPersonal emp2 = new EmpleadoPersonal(2,"Alicia Ramirez",600.00,38,Genero.MUJER);
		EmpleadoPersonal emp3 = new EmpleadoPersonal(3,"Juan Puga",908.00,36,Genero.HOMBRE);
		EmpleadoPersonal emp4 = new EmpleadoPersonal(4,"Javier Vazquez",330.00,36,Genero.HOMBRE);
		EmpleadoPersonal emp5 = new EmpleadoPersonal(5,"Evelin López",450.00,36,Genero.MUJER);
		EmpleadoPersonal emp6 = new EmpleadoPersonal(6,"Esmeralda López",450.00,38,Genero.MUJER);
		EmpleadoPersonal emp7 = new EmpleadoPersonal(7,"Oyuki Navarro",600.00,36,Genero.MUJER);
		EmpleadoPersonal emp8 = new EmpleadoPersonal(8,"Álvaro Mejía",450.50,22,Genero.HOMBRE);
		EmpleadoPersonal emp9 = new EmpleadoPersonal(9,"Olivia uárez",652.30,35,Genero.MUJER);
		EmpleadoPersonal emp10 = new EmpleadoPersonal(10,"Jessica Quevedo",584.22,38,Genero.MUJER);
		EmpleadoPersonal emp11 = new EmpleadoPersonal(11,"Oswaldo Sánchez",789.36,43,Genero.HOMBRE);
		EmpleadoPersonal emp12 = new EmpleadoPersonal(12,"Oscar Pérez",155.79,45,Genero.HOMBRE);
		EmpleadoPersonal emp13 = new EmpleadoPersonal(13,"Lionel Messi",321.12,38,Genero.HOMBRE);
		EmpleadoPersonal emp14 = new EmpleadoPersonal(14,"Ricardo Kaká",796.36,32,Genero.HOMBRE);
		EmpleadoPersonal emp15 = new EmpleadoPersonal(15,"Cristiano Ronaldo",127.87,30,Genero.HOMBRE);
		EmpleadoPersonal emp16 = new EmpleadoPersonal(16,"Andrés Iniesta",798.23,33,Genero.HOMBRE);
		EmpleadoPersonal emp17 = new EmpleadoPersonal(17,"Eva Perón",613.25,40,Genero.MUJER);
		EmpleadoPersonal emp18 = new EmpleadoPersonal(18,"Margarita Zavala",321.54,45,Genero.MUJER);
		EmpleadoPersonal emp19 = new EmpleadoPersonal(19,"Josefina Vázquez",821.48,50,Genero.MUJER);
		EmpleadoPersonal emp20 = new EmpleadoPersonal(20,"Patricia Zetina",432.55,49,Genero.MUJER);
		EmpleadoPersonal emp21 = new EmpleadoPersonal(21,"Loammi Vazquez",158.26,30,Genero.MUJER);
		EmpleadoPersonal emp22 = new EmpleadoPersonal(22,"David Isaí",464.48,30,Genero.HOMBRE);
		EmpleadoPersonal emp23 = new EmpleadoPersonal(24,"Absalón Monerreal",125.45,20,Genero.HOMBRE);
		EmpleadoPersonal emp24 = new EmpleadoPersonal(25,"Ruth Sabiñon",215.12,22,Genero.MUJER);
		EmpleadoPersonal emp25 = new EmpleadoPersonal(26,"Lorenzo Arano",545.15,26,Genero.HOMBRE);
		EmpleadoPersonal emp26 = new EmpleadoPersonal(27,"Horacio Cervantes",145.54,45,Genero.HOMBRE);
		EmpleadoPersonal emp27 = new EmpleadoPersonal(28,"Julio Baista",558.45,24,Genero.HOMBRE);
		EmpleadoPersonal emp28 = new EmpleadoPersonal(29,"Edmundo Aguilar",876.15,38,Genero.HOMBRE);
		EmpleadoPersonal emp29 = new EmpleadoPersonal(30,"Angel Marquez",897.55,38,Genero.HOMBRE);
		EmpleadoPersonal emp30 = new EmpleadoPersonal(32,"Martha Sahagún",124.45,50,Genero.MUJER);
		EmpleadoPersonal emp31 = new EmpleadoPersonal(33,"Vicente Fox",515.45,60,Genero.HOMBRE);
		EmpleadoPersonal emp32 = new EmpleadoPersonal(34,"Roberto Pintado",287.54,59,Genero.HOMBRE);
		EmpleadoPersonal emp33 = new EmpleadoPersonal(35,"Alicia Villareal",872.54,45,Genero.MUJER);
		EmpleadoPersonal emp34 = new EmpleadoPersonal(36,"Lola Beltrán",245.77,26,Genero.MUJER);

		
		return Arrays.asList( emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, 
							 emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,	
							 emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30,
							 emp31, emp32, emp33, emp34);
				
	}

	@Override
	public int compareTo(EmpleadoPersonal emp) {
		
		String nombreEmpleado = this.getNombre();
		
		int comparacionNombres = nombreEmpleado.compareTo(emp.getNombre());
		
		return comparacionNombres;
	}
	
}
