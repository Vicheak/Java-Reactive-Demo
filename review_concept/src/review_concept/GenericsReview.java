package review_concept;

import java.util.List;
import java.util.function.Consumer;

public class GenericsReview {
	
	static Printer printer = new Printer(); 

	public static void main(String[] args) {

		List<String> names = List.of("Dara", "Thida", "Veasna");

//		names.stream()
//			.forEach(x -> System.out.println(x));
//			.forEach(x -> {
//				int length = x.length();
//				System.out.println(x + " : has " + length + " letters");
//			});	
		
//		names.stream()
//			.forEach(System.out::println);	
		
//		names.stream()
//			.forEach(printText());
		
//		names.stream()
//			.forEach(printer::print);
		
//		names.stream()
//			.forEach(Printer::printAndCount);
		
//		names.stream()
//			.forEach(t -> Printer.printAndCount(t));
		
//		names.stream()
//			.forEach(t -> printer.print(t));
		
		names.stream()
			.map(x -> x.toUpperCase())
			.forEach(t -> printer.print(t));
	}
	
	private static Consumer<String> printText(){
//		return t -> System.out.println(t);
		return t -> {
			int length = t.length();
			System.out.println(t + " : has " + length + " letters");
		}; 
	}

}
