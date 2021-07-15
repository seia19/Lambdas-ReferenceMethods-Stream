package s6.eia.stream_map;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;


public class OperacionesMap_main {

	public static void main(String[] args) {

		System.out.println(" *** Mapeo de valores al cuadrado utilizando map y streams n.n: *** " + "\n");
			
			IntUnaryOperator intUnaryoperator = n -> (n*n);
			
			IntStream.rangeClosed(1, 5)
					 .map(intUnaryoperator)
					 .forEach(System.out::println);
			
		System.out.println("\n \n" + " *** Mapeo de valores utilizando List de Objetos. ***" + "\n");
			
			List<Trabajador> listaTrabajadores = Trabajador.listaTrabajador();
			
		System.out.println("\n" + "Ingreso Salarial Promedio del Personal Femenino mayor a 25 años." + "\n");
			
			double sumaIngresos = listaTrabajadores.stream()
												    .filter(emp ->emp.esMujer())
												    .filter(emp->emp.getEdad()>25)
													.mapToDouble(emp->emp.getIngresos()) //en este punto tengo un nuevo mapa con las mujeres mayores a 25 años junto con sus ingresos.
													.sum();
			
			double totTrabajadores = listaTrabajadores.stream()
													  .filter(emp->emp.esMujer() && emp.getEdad() >25)
													  .count();
			
			double promedioIngresos = sumaIngresos/totTrabajadores;
			
		System.out.println("Ingreso Promedio: " + promedioIngresos);
		
		System.out.println("\n" + "Ingreso Salarial Promedio del Personal Masculino mayor a 25 años." + "\n");
	
			
			double promIngresos = listaTrabajadores.stream()
				    .filter(emp ->emp.esHombre())
				    .filter(emp->emp.getEdad()>25)
					.mapToDouble(emp->emp.getIngresos()) //en este punto tengo un nuevo mapa con las mujeres mayores a 25 años junto con sus ingresos.
					.average()
					.getAsDouble();
			
		System.out.println("Ingreso Promedio: " + promIngresos);
	}

}
