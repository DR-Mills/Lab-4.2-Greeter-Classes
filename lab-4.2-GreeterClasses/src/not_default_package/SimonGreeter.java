package not_default_package;

public class SimonGreeter extends Greeter {

	public SimonGreeter(String greeting) {
		super(greeting);
	}

	//methods
	@Override
	public String greet(String name) {
		return "Simon says, \"" + greeting + ", " + name + "!\"";
	}


}
