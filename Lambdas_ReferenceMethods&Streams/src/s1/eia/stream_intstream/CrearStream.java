package s1.eia.stream_intstream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CrearStream {

	public static void main(String[] args) {

		Stream<String> stream1 = Stream.of("Hola Mündo n.n con Streams!! \n");
		stream1.forEach(System.out::println);
		
		Stream<String> stream2 = Stream.of("Curso de programación.","Orientada a Objetos \n");
		stream2.forEach(System.out::println);
		
		System.out.println("Lenguajes de Programación:");
		String [] lenguajesProgramacion = {"Java","C","Phyton","PHP","Angular \n"};
		Stream<String> stream3 = Stream.of(lenguajesProgramacion);
		stream3.forEach(System.out::println);
		
		
					System.out.println("Uso del método builder() \n");
		
		Stream<Estudiante> streamEst = Stream.<Estudiante>builder()
											 .add(new Estudiante("e01",17,1.70,9.5))
											 .add(new Estudiante("e01",19,1.60,10.0))
											 .build();
		
		streamEst.forEach(est -> System.out.println("Id Estudiante: " +est.getIdentficiacion() + " Edad " + est.getEdad()));
	
		
					System.out.println("\n Uso de la Interfaz IntStream \n");
			
		System.out.println("Lista de números utilizando método .range()");
		IntStream rangoDelUnoAlVeinte = IntStream.range(1, 21);
		rangoDelUnoAlVeinte.forEach(System.out::println); System.out.println();
		
		System.out.println("Lista de números utilizando método .rangeClosed()");
		IntStream rangoDeUnoToVeinte = IntStream.rangeClosed(1, 20);
		rangoDeUnoToVeinte.forEach(System.out::println);
					
		
	}

}
