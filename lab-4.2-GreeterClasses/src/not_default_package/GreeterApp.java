package not_default_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GreeterApp {

	public static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		List<Greeter> classArrayList = new ArrayList<Greeter>();

		printMenu();
		int menuChoice = Validator.integerWithinRange("Please enter a number from the menu above: ", scnr, 1, 6);
		;
		scnr.nextLine();

		String userGreeting = Validator.stringLettersOnly("Enter a greeting: ", scnr);
		String userName = Validator.stringLettersOnly("Enter your name: ", scnr);

		classArrayList.add(new Greeter(userGreeting));
		classArrayList.add(new SimonGreeter(userGreeting));
		classArrayList.add(new LoudGreeter(userGreeting));
		classArrayList.add(new HtmlGreeter(userGreeting));

		greetUser(classArrayList, menuChoice, userName);
	}

	private static void greetUser(List<Greeter> classArrayList, int greeterChoice, String userName) {
		switch (greeterChoice) {
		case 1:
			System.out.println(classArrayList.get(0).greet(userName));
			break;
		case 2:
			System.out.println(classArrayList.get(1).greet(userName));
			break;
		case 3:
			classArrayList.get(2).additionalPrompt();
			System.out.println(classArrayList.get(2).greet(userName));
			break;
		case 4:
			classArrayList.get(3).additionalPrompt();
			System.out.println(classArrayList.get(3).greet(userName));
			break;
		case 5:
			Random rndm = new Random();
			int randomNumber = rndm.nextInt(4) + 1;
			greetUser(classArrayList, randomNumber, userName);
			break;
		case 6:
			for (Greeter grtr : classArrayList) {
				grtr.additionalPrompt();
			}
			for (Greeter grtr : classArrayList) {
				System.out.println(grtr.greet(userName));
			}
			break;
		}
	}

	public static void printMenu() {
//		The easy/efficient way.....
		System.out.println("Welcome to the Greeter App. Our current greeter menu includes:");
		System.out.println("1.  Greeter");
		System.out.println("2.  Simon Greeter");
		System.out.println("3.  Loud Greeter");
		System.out.println("4.  HTML Greeter");
		System.out.println("5.  Random (1-4) Greeter");
		System.out.println("6.  Greedy (all Greeters)\n");

//		the inefficient, but fun way.....
//		TreeMap<Integer, String> menu = new TreeMap<>(Map.of(1, "Greeter", 2, "Simon Greeter", 3, "Loud Greeter", 4,
//				"HTML Greeter", 5, "Random (1-4) Greeter", 6, "All Greeters"));
//		for (Map.Entry<Integer, String> entry : menu.entrySet()) {
//			System.out.printf("%-2s%-10s%n", entry.getKey(), entry.getValue());
//		}
	}
}
