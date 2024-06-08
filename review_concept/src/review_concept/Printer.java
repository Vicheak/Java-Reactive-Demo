package review_concept;

public class Printer {
	
	public void print(String text) {
		System.out.println("print : " + text);
	}
	
	public static void printAndCount(String text) {
		System.out.println(text + " : has " + text.length() + " letters");
	}

}
