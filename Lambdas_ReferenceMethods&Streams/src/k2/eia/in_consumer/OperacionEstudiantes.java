package k2.eia.in_consumer;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiantes {

	
	public void  aceptaTodosEstudiantes(List<Estudiante> listaEstudiantes,
									    Consumer<Estudiante> consEstudiantes){
		
		for (Estudiante est: listaEstudiantes) {
			
			consEstudiantes.accept(est);
			//El método .accept() ejecuta la instrucción declarada en el Consumer
		}
	
	}
}
