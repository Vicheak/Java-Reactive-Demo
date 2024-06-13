package java_reactive_demo.util;

import java.util.function.Consumer;

public class Util {
	
	public static Consumer<String> onNext() {
		return x -> System.out.println("onNext : " + x);
	}
	
	public static Consumer<Throwable> onError(){
		return x -> System.out.println("onError : " + x.getMessage());
	}
	
	public static Runnable onComplete(){
		return () -> System.out.println("onComplete : Done");
	}
	
	public static void delay(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
