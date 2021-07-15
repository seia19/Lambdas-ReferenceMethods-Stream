package q.eia.m_referenciados_static;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Persontina_Main {

	public static void main(String[] args) {
		
		

		List<Personita> listaPersonitas = Arrays.asList(
				
				
				new Personita("Juan",19,"juanacas@hotmail.com"),
				new Personita("Mario",17,"mario@hotmail.com"),
				new Personita("Arturo",17,"arturo@hotmail.com"),
				new Personita("Beatriz",14,"betty@hotmail.com"),
				new Personita("Olivia",28,"olivita@hotmail.com"),
				new Personita("Angel",25,"angel@hotmail.com"),
				new Personita("Omar",23,"omar@hotmail.com"),
				new Personita("Pamela",28,"pamelita@hotmail.com"),
				new Personita("Sadee",25,"sadee@hotmail.com"),
				new Personita("Jared",12,"jared@hotmail.com"),	
				new Personita("Sebastian",14,"sebastian@hotmail.com"),
				new Personita("Javier",18,"jabier@hotmail.com"),
				new Personita("Roberto",20,"bobby@hotmail.com"),
				new Personita("Oyuki",22,"oyukita@hotmail.com"),
				new Personita("Linda",25,"lindita@hotmail.com"),
				new Personita("Gustavo",14,"tavo@hotmail.com"),
				new Personita("Lourdes",15,"lulita@hotmail.com"),
				new Personita("Raquel",16,"raquelita@hotmail.com")
				);
		
		
		
	System.out.println("Lista de Personitas sin ordenar:" + "\n");
		
		listaPersonitas.forEach(per->System.out.println(per));
		
		System.out.println("");

	System.out.println("Lista de Personitas ordenadas por Nombre:" + "\n");
		
		Comparator<Personita> comparador = (per1,per2)-> per1.getNombre().compareTo(per2.getNombre());
		
		//Collections.sort(listaPersonitas); -->  marcará error porque la clase Personita no implementa la interfaz Comparator
		Collections.sort(listaPersonitas,comparador);
		
		listaPersonitas.forEach(pNom -> System.out.println(pNom));
		
		System.out.println("");
		
	System.out.println("Lista de Personitas ordenadas por Edad Utilizando nuestro método estatico compararPorEdad:" + "\n");
		
		Comparator<Personita> comparador2 = (per1,per2)-> (Personita.compararPorEdad(per1, per2));
		Collections.sort(listaPersonitas,comparador2);
		
		listaPersonitas.forEach(pEdad -> System.out.println(pEdad));
		
		
		System.out.println("");
		
	System.out.println("Lista de Personitas ordenadas por Edad Utilizando Método referenciado --> compararPorEdad:" + "\n");
		
//		Comparator<Personita> comparador3 = (per1,per2)-> (Personita.compararPorEdad(per1, per2));
		Comparator<Personita> comparador3 = (Personita::compararPorEdad); //Referencia a un método static 

		
		Collections.sort(listaPersonitas,comparador3);
		
//		listaPersonitas.forEach(pEdad -> System.out.println(pEdad));
		listaPersonitas.forEach(System.out::println);
		
		/**Los métodos referenciados son la abstracción de Lambdas
		 
		 Las reglas para su uso son:
		 
		 a) que exista una interfaz funcional. (Al igual que Lambdas)
		 b) que llamen a un método ya existente
		 
		 ambos casos se tienen que cumplir para que se puedan utilizar
		 los métodos referenciados.
		 * */
	}

}