package s3.eia.stream_colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Colections_Main {

	public static void main(String[] args) {
		
			int [] numeros = {1,2,3,4,5,6,7};
			
		System.out.println("Lista de Números:");
			IntStream numStream = Arrays.stream(numeros);
			numStream.forEach(System.out::println);
			
			
		System.out.println("\n" + "Lista de Nombres:" + "\n");
			Stream<String> nombres = Arrays.stream(new String[]{"Juan","Pedro","María"});
			nombres.forEach(System.out::println);
			
			
		System.out.println("\n" + " - Set - de Lenguajes de Programación:" + "\n");
			Set<String> lenguajes = new HashSet<String>();
			
			lenguajes.add("Java");
			lenguajes.add("C");
			lenguajes.add("Angular");
			
			Stream<String> streamLenguajes = lenguajes.stream();
			streamLenguajes.forEach(System.out::println);

			
		System.out.println("\n" + " - List - de Estudiantes:" + "\n");
			
			MiEstudiante e1 = new MiEstudiante("est-001","eia",19,1.70,9.0);
			MiEstudiante e2 = new MiEstudiante("est-002","seia",20,1.66,10.00);
			MiEstudiante e3 = new MiEstudiante("est-003","eiata",19,1.85,9.5);
			
			MiEstudiante e4 = new MiEstudiante("est-004","Myeia",19,1.70,10.00);
			MiEstudiante e5 = new MiEstudiante("est-005","Myseia",20,1.66,10.00);
			MiEstudiante e6 = new MiEstudiante("est-006","Myeiata",19,1.85,9.5);
			
			
			List<MiEstudiante> listaEstudiantes = new ArrayList<MiEstudiante>();
			listaEstudiantes.add(e1);
			listaEstudiantes.add(e2);
			listaEstudiantes.add(e3);
			
			listaEstudiantes.stream().forEach(e->System.out.println("Id Estudiante: "+e.getIdentficiacion()+" Edad: " + e.getEdad() + " Promedio: " + e.getPromedio()));

		System.out.println("\n" + " - List - de Estudiantes Utilizando Parallel Stream:" + "\n");
			List<MiEstudiante> listaEstudiantesCompleta = new ArrayList<MiEstudiante>();
			
			listaEstudiantesCompleta.add(e1);
			listaEstudiantesCompleta.add(e2);
			listaEstudiantesCompleta.add(e3);
			listaEstudiantesCompleta.add(e4);
			listaEstudiantesCompleta.add(e5);
			listaEstudiantesCompleta.add(e6);
			
			Stream<MiEstudiante> paralellEstudiante = listaEstudiantesCompleta.parallelStream();
			paralellEstudiante.forEach(System.out::println);
	}
}
