package p.eia.in_comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator_Test {

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("Ana","Carlos","Ariatna","Germ�n");
		
		System.out.println("Lista de Nombres antes de ordenarse: " + nombres);
		
		Collections.sort(nombres);
		
		System.out.println("Lista de Nombres depu�s de ordenarse: " + nombres);
		
	}
}
