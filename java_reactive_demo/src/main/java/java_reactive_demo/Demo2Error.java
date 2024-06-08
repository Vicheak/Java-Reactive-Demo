package java_reactive_demo;

import reactor.core.publisher.Mono;

public class Demo2Error {
	
	public static void main(String[] args) {
		
//		Mono<Integer> mono = Mono.just(1).map(x -> x % 0);
		Mono<Integer> mono = Mono
				.just("Thida")
				.map(x -> x.length())
				.map(t -> new RuntimeException("Something happens"))
				.map(x -> 5); 
		
		mono.subscribe(
				x -> System.out.println("onNext : " + x),
				x -> System.out.println("onError : " + x.getMessage()),
				() -> System.out.println("onComplete : Done")); 
		
	}

}
