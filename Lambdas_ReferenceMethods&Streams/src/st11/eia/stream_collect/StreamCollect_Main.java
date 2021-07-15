package st11.eia.stream_collect;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
 .collect()
 
 Sintaxis 1:
 
 <R,A> R collect(Collector<? super T,A,R> collector)
 
 
  Sintaxis 2:
  <R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> acumulator, Biconsumer<R,R> combiner)
  
 
 * */


public class StreamCollect_Main {

	public static void main(String[] args) {
		//Se quieren tener todos los elementos del stream dentro de un array de String
		
		/**La interfaz funcional Supplier no recibe parámetros*/
	   //Supplier<List<String>> proveedor = ()-> new ArrayList();
		Supplier<ArrayList<String>> proveedor = (ArrayList::new);
		
		/**El primer parámetro de BiConsumer debe ser el mismo que el dado por el Supplier, 
		   el segundo parametro hace referencia al tipo de dato, que manejará el stream*/
	  //BiConsumer<ArrayList<String>, String> acumulador = (lista, str) -> lista.add(str);
		BiConsumer<ArrayList<String>, String> acumulador = (ArrayList::add);
		
		/** Los argumentos del segundo Biconsumer deben ser los mismos que el entregado
		     por la interfaz Supplier. La función de este segundo Biconsumer, es,
		     durante la ejecución de un stream paralelizado, tomar dichos arugumentos 
		     y combinarlos para otorgar un resultado*/
	 //BiConsumer<ArrayList<String>, ArrayList<String>> combinador = (listPar1,listPar2)->listPar1.addAll(listPar2);
	   BiConsumer<ArrayList<String>, ArrayList<String>> combinador = (ArrayList::addAll);
	   
	  // .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
	   
	  
	   List<String> nombres = MisEmployees.listaMisEmpleados()
			   						  	  .stream()
			   						      .map(emp->emp.getNombre())
			   						  //  .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
			   						      .collect(proveedor,acumulador,combinador); //almacena en nuevo arrayList los datos
			   						
	   System.out.println("Los nombres de los mis empleados son:" + nombres.toString());
;
	}

}
