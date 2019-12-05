package day59_Exceptions;

public class NoBreakTimeException extends RuntimeException{
	
	public NoBreakTimeException() {
		
		super("Too much break in Java course");
		System.err.println("There is no break till we get job done");
	}

}
