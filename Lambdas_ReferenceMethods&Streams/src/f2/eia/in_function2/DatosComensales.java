package f2.eia.in_function2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class DatosComensales {

	public static void main(String[] args) {
		List<Comensal> listComensales;
		
		//Conviertiendo los obj comensales a una List<Comensal>
		listComensales = Arrays.asList(
					
		   new Comensal("seia",1300,4),
		   new Comensal("eiata",1500,19),
		   new Comensal("e&a",1100,17)
									     );
		
		Function<Comensal,Object> function_ComensalNombretToObj = (x-> x.getNombre());
		
		List<Object> listaNombresComensales = getDataComensales(listComensales, function_ComensalNombretToObj);
	
		Function<Comensal, Object> funcion_comensalMontoToObj = (m->m.getMonto_pedido());
		List<Object> listaMontoComensales = getDataComensales(listComensales, funcion_comensalMontoToObj);
		
		for (Object comensal: listaNombresComensales ) {
		
			for(Object monto: listaMontoComensales) {
			System.out.println("Nombre Comensal: " + comensal +"." + 
							      "-->" + "Monto: $" + monto + ".");
			break;
			}
		}
		
		
		
	}
		
	
	public static List<Object> getDataComensales(List<Comensal> listaComensales, 
									   			 Function<Comensal,Object> funcion) {
		
		List<Object> listaDatos = new LinkedList<Object>();
		
		for(Comensal c: listaComensales) {
			
			Object o = funcion.apply(c);
			listaDatos.add(o);
		}
		
		return listaDatos;
	}
	
}

