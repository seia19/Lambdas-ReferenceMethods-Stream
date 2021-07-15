package s8.eia.stream_op_mat;

import java.util.Arrays;
import java.util.List;
						//necesario para ordenar los objetos de dicha clase.
public class MisEmpleados implements Comparable<MisEmpleados>{

	private long id;
	private String nombre;
	private double ingresos;
	private int edad;
	private Genero genero;
	
	public static enum Genero{
		HOMBRE, MUJER
	}

	public MisEmpleados(long id, String nombre, double ingresos, int edad, Genero genero) {
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
	
	public static List<MisEmpleados> listaMisEmpleados(){
		
		MisEmpleados emp1 = new MisEmpleados(1,"Juan Perez",538.00,26,Genero.HOMBRE);
		MisEmpleados emp2 = new MisEmpleados(1,"Alicia Ramirez",600.00,38,Genero.MUJER);
		MisEmpleados emp3 = new MisEmpleados(3,"Juan Puga",908.00,36,Genero.HOMBRE);
		MisEmpleados emp4 = new MisEmpleados(4,"Javier Vazquez",330.00,36,Genero.HOMBRE);
		MisEmpleados emp5 = new MisEmpleados(5,"Evelin López",450.00,36,Genero.MUJER);
		MisEmpleados emp6 = new MisEmpleados(6,"Esmeralda López",450.00,38,Genero.MUJER);
		MisEmpleados emp7 = new MisEmpleados(7,"Oyuki Navarro",600.00,36,Genero.MUJER);
		MisEmpleados emp8 = new MisEmpleados(8,"Álvaro Mejía",450.50,22,Genero.HOMBRE);
		MisEmpleados emp9 = new MisEmpleados(9,"Olivia uárez",652.30,35,Genero.MUJER);
		MisEmpleados emp10 = new MisEmpleados(10,"Jessica Quevedo",584.22,38,Genero.MUJER);
		MisEmpleados emp11 = new MisEmpleados(11,"Oswaldo Sánchez",789.36,43,Genero.HOMBRE);
		MisEmpleados emp12 = new MisEmpleados(12,"Oscar Pérez",155.79,45,Genero.HOMBRE);
		MisEmpleados emp13 = new MisEmpleados(13,"Lionel Messi",321.12,38,Genero.HOMBRE);
		MisEmpleados emp14 = new MisEmpleados(14,"Ricardo Kaká",796.36,32,Genero.HOMBRE);
		MisEmpleados emp15 = new MisEmpleados(15,"Cristiano Ronaldo",127.87,30,Genero.HOMBRE);
		MisEmpleados emp16 = new MisEmpleados(16,"Andrés Iniesta",798.23,33,Genero.HOMBRE);
		MisEmpleados emp17 = new MisEmpleados(17,"Eva Perón",613.25,40,Genero.MUJER);
		MisEmpleados emp18 = new MisEmpleados(18,"Margarita Zavala",321.54,45,Genero.MUJER);
		MisEmpleados emp19 = new MisEmpleados(19,"Josefina Vázquez",821.48,50,Genero.MUJER);
		MisEmpleados emp20 = new MisEmpleados(20,"Patricia Zetina",432.55,49,Genero.MUJER);
		MisEmpleados emp21 = new MisEmpleados(21,"Loammi Vazquez",158.26,30,Genero.MUJER);
		MisEmpleados emp22 = new MisEmpleados(22,"David Isaí",464.48,30,Genero.HOMBRE);
		MisEmpleados emp23 = new MisEmpleados(24,"Absalón Monerreal",125.45,20,Genero.HOMBRE);
		MisEmpleados emp24 = new MisEmpleados(25,"Ruth Sabiñon",215.12,22,Genero.MUJER);
		MisEmpleados emp25 = new MisEmpleados(26,"Lorenzo Arano",545.15,26,Genero.HOMBRE);
		MisEmpleados emp26 = new MisEmpleados(27,"Horacio Cervantes",145.54,45,Genero.HOMBRE);
		MisEmpleados emp27 = new MisEmpleados(28,"Julio Baista",558.45,24,Genero.HOMBRE);
		MisEmpleados emp28 = new MisEmpleados(29,"Edmundo Aguilar",876.15,38,Genero.HOMBRE);
		MisEmpleados emp29 = new MisEmpleados(30,"Angel Marquez",897.55,38,Genero.HOMBRE);
		MisEmpleados emp30 = new MisEmpleados(32,"Martha Sahagún",124.45,50,Genero.MUJER);
		MisEmpleados emp31 = new MisEmpleados(33,"Vicente Fox",515.45,60,Genero.HOMBRE);
		MisEmpleados emp32 = new MisEmpleados(34,"Roberto Pintado",287.54,59,Genero.HOMBRE);
		MisEmpleados emp33 = new MisEmpleados(35,"Alicia Villareal",872.54,45,Genero.MUJER);
		MisEmpleados emp34 = new MisEmpleados(36,"Lola Beltrán",245.77,26,Genero.MUJER);

		
		return Arrays.asList( emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, 
							 emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,	
							 emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30,
							 emp31, emp32, emp33, emp34);
				
	}

	@Override
	public int compareTo(MisEmpleados emp) {
		
		String nombreEmpleado = this.getNombre();
		
		int comparacionNombres = nombreEmpleado.compareTo(emp.getNombre());
		
		return comparacionNombres;
	}
	
}
