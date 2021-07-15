package q3.eia.m_ref_instacia_arbitraria;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MiPersona_Main {

	public static void main(String[] args) {
		
		List<MiPersona> listaPersonas = Arrays.asList(
				
				
				new MiPersona("Juan",19,"juanacas@hotmail.com",7000),
				new MiPersona("Mario",17,"mario@hotmail.com",14000),
				new MiPersona("Arturo",17,"arturo@hotmail.com",7000),
				new MiPersona("Beatriz",14,"betty@hotmail.com",12000),
				new MiPersona("Olivia",28,"olivita@hotmail.com",8000),
				new MiPersona("Angel",25,"angel@hotmail.com",9000),
				new MiPersona("Omar",23,"omar@hotmail.com",11000),
				new MiPersona("Pamela",28,"pamelita@hotmail.com",7000),
				new MiPersona("Sadee",25,"sadee@hotmail.com",16000),
				new MiPersona("Jared",12,"jared@hotmail.com",8000),	
				new MiPersona("Sebastian",14,"sebastian@hotmail.com",13000),
				new MiPersona("Javier",18,"jabier@hotmail.com",7000),
				new MiPersona("Roberto",20,"bobby@hotmail.com",15000),
				new MiPersona("Oyuki",22,"oyukita@hotmail.com",8000),
				new MiPersona("Linda",25,"lindita@hotmail.com",9000),
				new MiPersona("Gustavo",14,"tavo@hotmail.com",14000),
				new MiPersona("Lourdes",15,"lulita@hotmail.com",15000),
				new MiPersona("Raquel",16,"raquelita@hotmail.com",19000)
				);

		
	System.out.println("Lista de Personas ordenadas por Edad Utilizando Método referenciado static --> compararPorEdad:" + "\n");
		
//		Comparator<Person> comparador = (per1,per2)-> (Person.compararPorEdad(per1, per2));
		Comparator<MiPersona> comparador = (MiPersona::compararPorEdad); //Referencia a un método static 

//      Collections.sort(listaPersonas); --> daría un error de compilación x que la C Persons no implementa la interfaz Comparator
		Collections.sort(listaPersonas,comparador);
		
//		listaPersonas.forEach(pEdad -> System.out.println(pEdad));
		listaPersonas.forEach(System.out::println);
		
		System.out.println();
		
System.out.println("Lista de Personas ordenadas por Edad Utilizando Método referenciado por instancia de objeto:" + "\n");	
		
	Proveedor_Comparador provCompEdad = new Proveedor_Comparador();
	
	Comparator<MiPersona> comparador2 = provCompEdad::compararPorEdad; //Referencia a un método mediante una instancia de objeto
	
	Collections.sort(listaPersonas,comparador2);
	
	listaPersonas.forEach(System.out::println);
	
	System.out.println();
	
	
System.out.println("Lista de Personas ordenadas por Nombre Utilizando Método referenciado por instancia de objeto:" + "\n");	
	
	Proveedor_Comparador provCompNombre = new Proveedor_Comparador();
	
	Comparator<MiPersona> comparador3 = provCompNombre::compararPorNombre; //Referencia a un método mediante una instacia de objeto
	
	Collections.sort(listaPersonas, comparador3);
	
	listaPersonas.forEach(System.out::println);
	
	System.out.println();
	
System.out.println("Lista de Personas ordenadas por Salario Utilizando Método referenciado por instancia de objeto arbitrario:" + "\n");	

	
	//Comparator<MiPersona> comparador4 = (per1,per2) -> per1.compararPorSalario(per2);
	Comparator<MiPersona> comparador4 = MiPersona::compararPorSalario; //Referencia a método mediante un objeto arbitrario - se llama a la clase y luego a su método	
	
	Collections.sort(listaPersonas,comparador4);
	
	listaPersonas.forEach(System.out::println);
	
	/**Los métodos referenciados son la abstracción de Lambdas
		 
		 Las reglas para su uso son:
		 
		 a) que exista una interfaz funcional. (Al igual que Lambdas)
		 b) que llamen a un método ya existente
		 
		 ambos casos se tienen que cumplir para que se puedan utilizar
		 los métodos referenciados.
		 * */
	}

}