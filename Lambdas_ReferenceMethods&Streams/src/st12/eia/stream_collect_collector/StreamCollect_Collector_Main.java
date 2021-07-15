package st12.eia.stream_collect_collector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 .collect()
 
 Sintaxis 1:
 
 <R,A> R collect(Collector<? super T,A,R> collector)
 
 
  Sintaxis 2:
  <R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> acumulator, Biconsumer<R,R> combiner)
  
 
 * */


public class StreamCollect_Collector_Main {

	public static void main(String[] args) {


		List<MisEmpleadotes> listaEmpleadotes = MisEmpleadotes.listaMisEmpleados();
		
		
		
		List<String> listaNombresEmp = listaEmpleadotes.stream()
													   .map(emp->emp.getNombre())
												       .collect(Collectors.toList());
		
		System.out.println("los nombres de los empleados son: " + listaNombresEmp);

		
		Set<String> conjuntoSetNombresEmp = listaEmpleadotes.stream()
															 .map(MisEmpleadotes::getNombre)
															 .collect(Collectors.toSet());
		
		System.out.println("El conjunto 'Set' de nombres de los empleados" + conjuntoSetNombresEmp);
		
		//Un conjunto 'Set' se asegura que no existan duplicados de ninguno de los elementos que lo componen
	
	
		SortedSet<String> conjuntoSetNombresEmpOrdenados = listaEmpleadotes.stream()
				 														   .map(MisEmpleadotes::getNombre)
				 										                   .collect(Collectors.toCollection(TreeSet::new));
	
		System.out.println("El conjunto 'SortedSet' de nombres de los empleados es: " + conjuntoSetNombresEmpOrdenados);
	}

}
