package all_tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import not_default_package.Greeter;

class GreeterTest {

	@Test
	void singleWordInput() {
		String greeting = "Hello";
		Greeter testGreet = new Greeter(greeting);
		String name = "Bob";
		String actual = testGreet.greet(name);
		assertEquals("Hello, Bob!", actual);
	}

	@Test
	void multiWordInput() {
		String greeting = "Good day to you";
		Greeter testGreet = new Greeter(greeting);
		String name = "Sir Mix-A-Lot";
		String actual = testGreet.greet(name);
		assertEquals("Good day to you, Sir Mix-A-Lot!", actual);
	}
	
	@Test
	void chineseInput() {
		String greeting = "你好";
		Greeter testGreet = new Greeter(greeting);
		String name = "李小龙";
		String actual = testGreet.greet(name);
		assertEquals("你好, 李小龙!", actual);
	}

}
