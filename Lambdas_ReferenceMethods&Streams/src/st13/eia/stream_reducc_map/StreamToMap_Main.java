package st13.eia.stream_reducc_map;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class StreamToMap_Main {

	public static void main(String[] args) {

		  List<EmpleadoPersonal> listaMisEmpleadosPersonal = EmpleadoPersonal.listaMisEmpleadosPersonal();
		
		 
		 Map<Long, String> IdToNombreMapa = listaMisEmpleadosPersonal.stream()
				 													 .collect(Collectors.toMap(EmpleadoPersonal::getId, EmpleadoPersonal::getNombre));
		 
	
		 System.out.println(IdToNombreMapa + "\n");
		 
		 
		 //Mapeando empleados por género
		 
	
		 Map<EmpleadoPersonal.Genero,String> agruparEmpPorGenero = listaMisEmpleadosPersonal.stream()
				 												   .collect(Collectors.toMap(EmpleadoPersonal::getGenero, 
				 														   					 EmpleadoPersonal::getNombre,
				 														   					(nom1,nom2)->String.join(", ", nom1, nom2))); //concatena los nombres de los empleados mediante ','
	
	
		 System.out.println(agruparEmpPorGenero + "\n");
	
	}

}
