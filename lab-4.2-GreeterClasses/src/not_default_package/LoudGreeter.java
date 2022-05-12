package not_default_package;

import java.util.Scanner;

public class LoudGreeter extends Greeter {
	
	Scanner scnr = new Scanner(System.in);
	
	// field variables
		private String extra = "!";

	// constructor
	public LoudGreeter(String greeting) {
		super(greeting);
	}
	

	// methods
	@Override
	public String greet(String name) {
		return greeting + ", " + name + "!" + extra;
	}

	@Override
	public void additionalPrompt() {
		int userVolume = Validator.integerWithinRange("How much volume would you like to add? (0-10) ", scnr, 0, 10); 
		for (int i=0; i < userVolume; i++) {
			addVolume();
		}
	}
	
	public void addVolume() {
		extra += "!";
	}
	
	
	
}
