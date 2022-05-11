package not_default_package;

import java.util.Scanner;

public class HtmlGreeter extends Greeter {
	
	Scanner scnr = new Scanner(System.in);

	
	// field variables
	private String tagName;
	
	
	public String getTagName() {
		return tagName;
	}

	
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}


	// constructors
	public HtmlGreeter(String greeting) {
		super(greeting);
		this.tagName = "h1";
	}
	
	
	public HtmlGreeter(String greeting, String tagName) {
		super(greeting);
		this.tagName = tagName;
	}
	
	
	// methods
	@Override
	public String greet(String name) {
		return "<" + tagName + ">" + greeting + ", " + name + "!" + "</" + tagName + ">";
	}

	@Override
	public void additionalPrompt() {
		System.out.print("Please enter an HTML tag: ");
		tagName = scnr.nextLine(); 
	}
}
