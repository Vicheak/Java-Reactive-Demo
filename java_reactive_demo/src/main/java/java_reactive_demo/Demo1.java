package java_reactive_demo;

import reactor.core.publisher.Mono;

public class Demo1 {
	
	public static void main(String[] args) {
		
		//Mono : publisher with 0->1 item
		//Flux : publisher with 0->N item
		
		//lazy processing, execute when subscribe
		Mono<String> mono = Mono.just("Dara");
		//mono.subscribe(x -> System.out.println(x));
		
		//System.out.println(mono); //output : MonoJust
		
		mono.subscribe(
				x -> System.out.println("onNext : " + x),
				x -> System.out.println("onError : " + x.getMessage()),
				() -> System.out.println("onComplete : Done")); 
		
	}

}
