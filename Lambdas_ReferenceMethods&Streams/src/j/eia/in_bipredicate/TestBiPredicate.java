package j.eia.in_bipredicate;

import java.util.function.BiPredicate;

public class TestBiPredicate {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp = (x,y) -> x<y;
		
		boolean testNum = bp.test(5, 10);
		
		System.out.println("¿¿Es 'x' menor que 'y'??: " + testNum);
	}
}
