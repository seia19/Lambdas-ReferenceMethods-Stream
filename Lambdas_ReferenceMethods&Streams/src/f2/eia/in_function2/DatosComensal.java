package f2.eia.in_function2;

import java.util.function.Function;

public class DatosComensal {
	
	
	public static void main(String[] args) {
		
		Comensal comensal1= new Comensal("eia",1000.00,5);
		
		Function<Comensal, Object> obtenerNombre = x -> x.getNombre();
		String nombreComensal = (String)getDatoComensal(obtenerNombre, comensal1);
		
		int mesaComensal = (Integer) getDatoComensal(x->x.getMesa(),comensal1);
		
		System.out.println("El nombre del comensal es: " + nombreComensal);
		System.out.println("El número de mesa del comensal es: " + mesaComensal);

	
	
	}
	

	public static Object getDatoComensal(Function<Comensal,Object> funcion, Comensal comensal) {
		
		Object miComensal = funcion.apply(comensal);
		
		return miComensal;
		
	}
}
