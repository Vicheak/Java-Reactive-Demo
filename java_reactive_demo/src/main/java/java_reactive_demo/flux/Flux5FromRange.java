package java_reactive_demo.flux;

import java_reactive_demo.util.Util;
import reactor.core.publisher.Flux;

public class Flux5FromRange {

	public static void main(String[] args) {
		
//		Flux<Integer> flux = Flux.range(5, 10);
//		flux.subscribe(x -> System.out.println(x));
		
		//can be used as loop
		Flux.range(1, 10)
			//.map(x -> "Hello World")
			.map(x -> Util.faker().color().name())
			.subscribe(x -> System.out.println(x)); 

	}

}
