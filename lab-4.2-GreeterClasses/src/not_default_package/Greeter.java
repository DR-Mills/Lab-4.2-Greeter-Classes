package not_default_package;
import java.util.Scanner;

public class Greeter {

	Scanner scnr = new Scanner(System.in);
	
	//field variables
	protected String greeting;
	protected String name;
	

	//getters & setters
	public String getGreeting() {
		return greeting;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	//constructor
	public Greeter(String greeting) {
		this.greeting = greeting;
	}
	
	
	//methods
	public String greet(String name) {
		return greeting + ", " + name + "!";
	}
	
	public void additionalPrompt() {
		// place holder for subclasses
		}
		
}
