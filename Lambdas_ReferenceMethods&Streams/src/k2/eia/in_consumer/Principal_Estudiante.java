package k2.eia.in_consumer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Principal_Estudiante {

	public static void main(String[] args) {
		
			Principal_Estudiante principal = new Principal_Estudiante();
			OperacionEstudiantes opEstudiantes = new OperacionEstudiantes(); 
			
			
			List<Estudiante> miListaEstudiantes = principal.obtenerListaEstudiantes();
			
			
		System.out.println("Estudiantes sin calificaci�n actualizada: ");
			
		//Se imprime el nombre y calificaci�n del estudiante y se env�a como operaci�n, mediante el Consumer 'cons1' 
		// para que el m�todo .accept() de nuestra clase OperacionEstudiante, realice la operaci�n
			Consumer<Estudiante> cons1 = es->System.out.println(es.getNombre() + " Calificiaci�n: " + es.getCalificacion());
			opEstudiantes.aceptaTodosEstudiantes(miListaEstudiantes, cons1);
			
		System.out.println("\n *** Actualizando Calificaci�n de Estudiantes... *** \n ");
			
			//Se actualiza la calificaci�n de cada estudiante, aument�ndole un 10% y se env�a como operaci�n, mediante el Consumer 'cons2' 
			// para que el m�todo .accept() de nuestra clase OperacionEstudiante, realice la operaci�n	
		
			
			Consumer<Estudiante> cons2 = esCalif-> esCalif.setCalificacion(esCalif.getCalificacion()*1.10);
			opEstudiantes.aceptaTodosEstudiantes(miListaEstudiantes, cons2);
			
			
		System.out.println("Estudiantes - Calificaci�n actualizada: ");
			//se imprime el nombre y calificaci�n ya actualizada mediante cons1 --> .accept() -> OperacionEstudiante
			opEstudiantes.aceptaTodosEstudiantes(miListaEstudiantes, cons1);
			
	   System.out.println("Estudiantes - Calificaci�n actualizada [utilizando .andThen()]: ");
			Consumer<Estudiante> cons3 = cons2.andThen(cons1);
			opEstudiantes.aceptaTodosEstudiantes(miListaEstudiantes, cons3);
			
		}


		public List<Estudiante> obtenerListaEstudiantes(){
		
			List<Estudiante> listaDeEstudiantes = Arrays.asList(
					
					new Estudiante("Jhon",7.0),
					new Estudiante("Mark",8.0),
					new Estudiante("Felix",6.0),
					new Estudiante("Patrick",6.0),
					new Estudiante("Mathew",6.0),
					new Estudiante("Paul",8.0),
					new Estudiante("Judas",6.0),
					new Estudiante("Thomas",8.0),
					new Estudiante("Felipe",8.0),
					new Estudiante("Tom",6.0),
					new Estudiante("Maria",9.0),
					new Estudiante("Magdala",7.0),
					new Estudiante("Javier",7.0),
					new Estudiante("Amanda",8.0),
					new Estudiante("Olivia",9.0),
					new Estudiante("Cinthia",9.0),
					new Estudiante("Felicia",9.0),
					new Estudiante("Mancera",5.0),
					new Estudiante("Arturo",2.0),
					new Estudiante("E&A",9.0));
			
			
	return listaDeEstudiantes;		
	}
		
		
}
