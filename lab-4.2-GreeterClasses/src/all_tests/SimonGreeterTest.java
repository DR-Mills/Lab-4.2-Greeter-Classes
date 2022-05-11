package all_tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import not_default_package.Greeter;
import not_default_package.SimonGreeter;

class SimonGreeterTest {

	@Test
	void singleWordInput() {
		String greeting = "Hello";
		SimonGreeter testSimonGreet = new SimonGreeter(greeting);
		String name = "Bob";
		String actual = testSimonGreet.greet(name);
		assertEquals("Simon says, \"Hello, Bob!\"", actual);
	}

	@Test
	void multiWordInput() {
		String greeting = "What's up";
		SimonGreeter testSimonGreet = new SimonGreeter(greeting);
		String name = "Snoop Dogg";
		String actual = testSimonGreet.greet(name);
		assertEquals("Simon says, \"What's up, Snoop Dogg!\"", actual);
	}
	
	@Test
	void chineseWordInput() {
		String greeting = "干什么";
		SimonGreeter testSimonGreet = new SimonGreeter(greeting);
		String name = "Vava";
		String actual = testSimonGreet.greet(name);
		assertEquals("Simon says, \"干什么, Vava!\"", actual);
	}
}
