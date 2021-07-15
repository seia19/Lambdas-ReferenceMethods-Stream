package l2.eia.in_biconsumer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Biconsumer_Test {

	public static void main(String[] args) {
		
			Map<String, String> mapa = new HashMap<String, String>();
			
			String [][]nombrePaisArreglo = {
					
					{"Chris","Usa"},
					{"Rajhu", "India"},
					{"Lynda", "Canada"}
			};
			
			for (int i=0; i<nombrePaisArreglo.length;i++) {
				mapa.put(nombrePaisArreglo[i][0], nombrePaisArreglo[i][1]);
			}
			
		System.out.println("Forma tradicional de imprimir Clave-Valor de un Map: \n");
			
			Iterator<Map.Entry<String, String>> iterador = mapa.entrySet().iterator();
			
			if(iterador != null) {
				
				while(iterador.hasNext()==true) {
					
					Map.Entry<String, String> entry = iterador.next();
					System.out.println("Clave " + entry.getKey() + " Valor " + entry.getValue());
				}
			}
			
			
		System.out.println("\n Imprimiendo un mapa mediante Biconsumer, Lambdas y método .forEach(): \n");


			
			for (int i=0; i<nombrePaisArreglo.length;i++) {
				mapa.put(nombrePaisArreglo[i][0], nombrePaisArreglo[i][1]);
			} 
			
			/*Este ciclo for en particular no es necesario, pues es exactamente el mismo que el primer ciclo for,
			  pero lo agregué porque establecer que es necesario recorrel el arreglo para posteriormente 
			  establecer los valores mediante el método .forEach()*/
			
			mapa.forEach((key,value)->{System.out.println("Clave " + key + "\t" +" Valor " + value);});
			
		}
}
//"\t" -> Indica un Tab en la línea.