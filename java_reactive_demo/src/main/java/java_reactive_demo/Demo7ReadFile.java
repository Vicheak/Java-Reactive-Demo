package java_reactive_demo;

import java_reactive_demo.exercise.FileService;
import java_reactive_demo.util.Util;

public class Demo7ReadFile {
	
	public static void main(String[] args) {
		
//		FileService.read("file1.txt")
//			.subscribe(Util.onNext(), Util.onError(), Util.onComplete());
		
		//write to file
		//delete any file
		
//		FileService.write("file2.txt", "Hello Java Reactive")
//			.subscribe(Util.onNext(), Util.onError(), Util.onComplete());
		
		FileService.delete("file3.txt")
			.subscribe(Util.onNext(), Util.onError(), Util.onComplete()); 
		
	}

}
