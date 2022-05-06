
public class Greeter {

	//field variables
	protected String greeting;
	
	//getters & setters
	public String getGreeting() {
		return greeting;
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	//constructor
	public Greeter(String greeting) {
		this.greeting = greeting;
	}
	
	public String greet(String name) {
		return greeting + ", " + name + "!";
	}
}
