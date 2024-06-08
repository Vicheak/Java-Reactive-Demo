package java_reactive_demo;

import com.github.javafaker.Faker;

import java_reactive_demo.util.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class Demo6Pipeline {

	public static void main(String[] args) {
	
		//parallel execution
		getName(); 
		getName()
			.subscribeOn(Schedulers.boundedElastic())
			.subscribe(Util.onNext()); 
		getName(); 
		
		Util.delay(4);
		
		//user from database by id
		//int userId = 10; 
		
		//sequential execution
		//User user = userRepository.findById(userId); 
		//UserPreference prefer = pref.findById(userId); 
		//UserPreference prefer = pref.findByUsername(user.getName()); 
		
	}
	
	//Build pipeline - lazy execution
	private static Mono<String> getName() {
		System.out.println("Entering to method");
		return Mono.fromSupplier(() -> {
			System.out.println("Generating name ...");
			Util.delay(3); 
			return Faker.instance().country().name(); 
		}).map(x -> x.toUpperCase());
	}

}
