package s6.eia.stream_map;

import java.util.Arrays;
import java.util.List;

public class Trabajador {

	private long id;
	private String nombre;
	private double ingresos;
	private int edad;
	private Genero genero;
	
	public static enum Genero{
		HOMBRE, MUJER
	}

	public Trabajador(long id, String nombre, double ingresos, int edad, Genero genero) {
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
	
	public static List<Trabajador> listaTrabajador(){
		
		Trabajador emp1 = new Trabajador(1,"Juan Perez",538.00,26,Genero.HOMBRE);
		Trabajador emp2 = new Trabajador(1,"Alicia Ramirez",600.00,38,Genero.MUJER);
		Trabajador emp3 = new Trabajador(3,"Juan Puga",908.00,36,Genero.HOMBRE);
		Trabajador emp4 = new Trabajador(4,"Javier Vazquez",330.00,36,Genero.HOMBRE);
		Trabajador emp5 = new Trabajador(5,"Evelin López",450.00,36,Genero.MUJER);
		Trabajador emp6 = new Trabajador(6,"Esmeralda López",450.00,38,Genero.MUJER);
		Trabajador emp7 = new Trabajador(7,"Oyuki Navarro",600.00,36,Genero.MUJER);
		Trabajador emp8 = new Trabajador(8,"Álvaro Mejía",450.50,22,Genero.HOMBRE);
		Trabajador emp9 = new Trabajador(9,"Olivia uárez",652.30,35,Genero.MUJER);
		Trabajador emp10 = new Trabajador(10,"Jessica Quevedo",584.22,38,Genero.MUJER);
		Trabajador emp11 = new Trabajador(11,"Oswaldo Sánchez",789.36,43,Genero.HOMBRE);
		Trabajador emp12 = new Trabajador(12,"Oscar Pérez",155.79,45,Genero.HOMBRE);
		Trabajador emp13 = new Trabajador(13,"Lionel Messi",321.12,38,Genero.HOMBRE);
		Trabajador emp14 = new Trabajador(14,"Ricardo Kaká",796.36,32,Genero.HOMBRE);
		Trabajador emp15 = new Trabajador(15,"Cristiano Ronaldo",127.87,30,Genero.HOMBRE);
		Trabajador emp16 = new Trabajador(16,"Andrés Iniesta",798.23,33,Genero.HOMBRE);
		Trabajador emp17 = new Trabajador(17,"Eva Perón",613.25,40,Genero.MUJER);
		Trabajador emp18 = new Trabajador(18,"Margarita Zavala",321.54,45,Genero.MUJER);
		Trabajador emp19 = new Trabajador(19,"Josefina Vázquez",821.48,50,Genero.MUJER);
		Trabajador emp20 = new Trabajador(20,"Patricia Zetina",432.55,49,Genero.MUJER);
		Trabajador emp21 = new Trabajador(21,"Loammi Vazquez",158.26,30,Genero.MUJER);
		Trabajador emp22 = new Trabajador(22,"David Isaí",464.48,30,Genero.HOMBRE);
		Trabajador emp23 = new Trabajador(24,"Absalón Monerreal",125.45,20,Genero.HOMBRE);
		Trabajador emp24 = new Trabajador(25,"Ruth Sabiñon",215.12,22,Genero.MUJER);
		Trabajador emp25 = new Trabajador(26,"Lorenzo Arano",545.15,26,Genero.HOMBRE);
		Trabajador emp26 = new Trabajador(27,"Horacio Cervantes",145.54,45,Genero.HOMBRE);
		Trabajador emp27 = new Trabajador(28,"Julio Baista",558.45,24,Genero.HOMBRE);
		Trabajador emp28 = new Trabajador(29,"Edmundo Aguilar",876.15,38,Genero.HOMBRE);
		Trabajador emp29 = new Trabajador(30,"Angel Marquez",897.55,38,Genero.HOMBRE);
		Trabajador emp30 = new Trabajador(32,"Martha Sahagún",124.45,50,Genero.MUJER);
		Trabajador emp31 = new Trabajador(33,"Vicente Fox",515.45,60,Genero.HOMBRE);
		Trabajador emp32 = new Trabajador(34,"Roberto Pintado",287.54,59,Genero.HOMBRE);
		Trabajador emp33 = new Trabajador(35,"Alicia Villareal",872.54,45,Genero.MUJER);
		Trabajador emp34 = new Trabajador(36,"Lola Beltrán",245.77,26,Genero.MUJER);

		
		return Arrays.asList( emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, 
							 emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,	
							 emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30,
							 emp31, emp32, emp33, emp34);
				
	}
	
}
