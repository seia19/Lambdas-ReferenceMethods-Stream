package s7.eia.stream_sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;


public class OperacionesSorted_main {

	public static void main(String[] args) {
		
		System.out.println("Nombres Ordenados: " + "\n");
		
		Arrays.asList("Alfredo", "Maria","Daniel","Brenda")
			  .stream()
			  .sorted()
			  .forEach(System.out::println);
		
		
		System.out.println("\n" + "Nombres Ordenados: " + "\n");
		
		Arrays.asList(1,2,7,8,9,1,5,2,1,5,3,5)
			  .stream()
			  .sorted()
			  .forEach(System.out::println);
		
		
		System.out.println("\n" + "Nombres de Empleados Ordenados: " + "\n");
		
		List<MiEmpleado> listaEmpleados = MiEmpleado.listaMisEmpleados();
		
		listaEmpleados.stream()
					  .sorted() //Para poder ordenar los objetos, Es necesario que dicha Clase, implemente la Intefaz Comparable
					  .forEach(em->System.out.println("Nombre Empleado: "+em.getNombre() + " Salario: $"
							  						+ em.getIngresos()+ " Género " +em.getGenero() ) );

		
		System.out.println("\n" + "Nombres de Empleados Ordenados por edad: " + "\n");
		
		Comparator<MiEmpleado> comparacionPorEdad = (emp1,emp2) -> emp1.getEdad()-emp2.getEdad(); //Internamente JVM utiliza el método compare para realizar la ordenación x edad
		
		listaEmpleados.stream()
					  .sorted(comparacionPorEdad)
					  .forEach(em->System.out.println("Nombre Empleado: "+em.getNombre() + " edad: " +em.getEdad()));
		
		
		
		System.out.println("\n" + "Nombres de Empleados mayores de 25 años, Ordenados por Ingresos: " + "\n");
		
		Comparator<MiEmpleado> comparacionPorSalario = (emp1,emp2) -> (int) (emp1.getIngresos() - emp2.getIngresos()); //uso interno de .compare() para ordenar x ingresos.
		
		listaEmpleados.stream()
					  .filter(emp->emp.getEdad()>25)
					  .sorted(comparacionPorSalario)
					  .forEach(em->System.out.println("Nombre Empleado: "+em.getNombre() + " Edad: "+ em.getEdad() + " Salario: $" + em.getIngresos()));
					  
	}

}
