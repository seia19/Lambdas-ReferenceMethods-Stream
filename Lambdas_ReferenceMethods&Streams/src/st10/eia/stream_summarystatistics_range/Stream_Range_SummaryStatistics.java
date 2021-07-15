package st10.eia.stream_summarystatistics_range;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Stream_Range_SummaryStatistics {

	public static void main(String[] args) {
		
		IntSummaryStatistics opEstadisticaRango = IntStream.range(1, 20)
													 	   .summaryStatistics(); //obtine la suma, el max, el min, el promedio y el num elementos
	
	
	System.out.println("Las operaciones estadísticas del rango del 1 al 20 son: " + opEstadisticaRango);
	
	
		System.out.println("Suma: " + IntStream.range(1, 20).summaryStatistics().getSum());
		System.out.println("Promedio: " + IntStream.range(1, 20).summaryStatistics().getAverage());
		System.out.println("Elementos: " + IntStream.range(1, 20).summaryStatistics().getCount());
		System.out.println("Máximo: " + IntStream.range(1, 20).summaryStatistics().getMax());
		System.out.println("Mínimo: " + IntStream.range(1, 20).summaryStatistics().getMin());

	}
	
	
	
}
