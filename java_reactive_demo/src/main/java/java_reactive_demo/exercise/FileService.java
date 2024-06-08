package java_reactive_demo.exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import reactor.core.publisher.Mono;

public class FileService {

	public static Mono<String> read(String fileName) {
		return Mono.fromSupplier(() -> readFile(fileName));
	}

	private static String readFile(String fileName) {
		System.out.println("Reading file...");
		Path path = Paths.get("src/main/resources");
		try {
			return Files.readString(path.resolve(fileName));
		} catch (IOException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static Mono<String> write(String fileName, String text){
		return Mono.fromSupplier(() -> writeToFile(fileName, text)); 
	}

	private static String writeToFile(String fileName, String text) {
		System.out.println("Writing to file...");
		Path path = Paths.get("src/main/resources"); 
		try {
			Files.write(path.resolve(fileName), text.getBytes());
		} catch (IOException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
		return "Writing to %s successfully!".formatted(fileName); 
	}
	
	public static Mono<String> delete(String fileName){
		return Mono.fromSupplier(() -> deleteFile(fileName)); 
	}
	
	private static String deleteFile(String fileName) {
		System.out.println("Deleting file...");
		Path path = Paths.get("src/main/resources"); 
		try {
			Files.delete(path.resolve(fileName)); 
		} catch (IOException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
		return "Deleting file %s successfully!".formatted(fileName); 
	}

}
