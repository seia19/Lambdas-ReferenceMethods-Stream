package k.eia.in_consumer;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {

		Consumer<String> consumer = x -> System.out.println(x.toLowerCase());
		
		consumer.accept("hello eia n.n");
	}
}
