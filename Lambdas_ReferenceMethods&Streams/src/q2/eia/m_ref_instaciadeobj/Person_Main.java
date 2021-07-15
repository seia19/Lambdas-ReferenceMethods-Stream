package q2.eia.m_ref_instaciadeobj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person_Main {

	public static void main(String[] args) {
		
		

		List<Person> listaPersons = Arrays.asList(
				
				
				new Person("Juan",19,"juanacas@hotmail.com"),
				new Person("Mario",17,"mario@hotmail.com"),
				new Person("Arturo",17,"arturo@hotmail.com"),
				new Person("Beatriz",14,"betty@hotmail.com"),
				new Person("Olivia",28,"olivita@hotmail.com"),
				new Person("Angel",25,"angel@hotmail.com"),
				new Person("Omar",23,"omar@hotmail.com"),
				new Person("Pamela",28,"pamelita@hotmail.com"),
				new Person("Sadee",25,"sadee@hotmail.com"),
				new Person("Jared",12,"jared@hotmail.com"),	
				new Person("Sebastian",14,"sebastian@hotmail.com"),
				new Person("Javier",18,"jabier@hotmail.com"),
				new Person("Roberto",20,"bobby@hotmail.com"),
				new Person("Oyuki",22,"oyukita@hotmail.com"),
				new Person("Linda",25,"lindita@hotmail.com"),
				new Person("Gustavo",14,"tavo@hotmail.com"),
				new Person("Lourdes",15,"lulita@hotmail.com"),
				new Person("Raquel",16,"raquelita@hotmail.com")
				);

		
	System.out.println("Lista de Personas ordenadas por Edad Utilizando Método referenciado static --> compararPorEdad:" + "\n");
		
//		Comparator<Person> comparador = (per1,per2)-> (Person.compararPorEdad(per1, per2));
		Comparator<Person> comparador = (Person::compararPorEdad); //Referencia a un método static 

//      Collections.sort(listaPersons); --> daría un error de compilación x que la C Persons no implementa la interfaz Comparator
		Collections.sort(listaPersons,comparador);
		
//		listaPersons.forEach(pEdad -> System.out.println(pEdad));
		listaPersons.forEach(System.out::println);
		
		System.out.println();
		
System.out.println("Lista de Personas ordenadas por Edad Utilizando Método referenciado por instancia de objeto:" + "\n");	
		
	ProveedorComparaciones provCompEdad = new ProveedorComparaciones();
	
	Comparator<Person> comparador2 = provCompEdad::compararPorEdad; //Referencia a un método mediante una instancia de objeto
	
	Collections.sort(listaPersons,comparador2);
	
	listaPersons.forEach(System.out::println);
	
	System.out.println();
	
	
System.out.println("Lista de Personas ordenadas por Nombre Utilizando Método referenciado por instancia de objeto:" + "\n");	
	
	ProveedorComparaciones provCompNombre = new ProveedorComparaciones();
	
	Comparator<Person> comparador3 = provCompNombre::compararPorNombre; //Referencia a un método mediante una instacia de objeto
	
	Collections.sort(listaPersons, comparador3);
	
	listaPersons.forEach(System.out::println);
	
		
		/**Los métodos referenciados son la abstracción de Lambdas
		 
		 Las reglas para su uso son:
		 
		 a) que exista una interfaz funcional. (Al igual que Lambdas)
		 b) que llamen a un método ya existente
		 
		 ambos casos se tienen que cumplir para que se puedan utilizar
		 los métodos referenciados.
		 * */
	}

}