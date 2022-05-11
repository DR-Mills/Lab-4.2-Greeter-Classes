package all_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import not_default_package.Greeter;
import not_default_package.HtmlGreeter;

class HtmlGreeterTest {

	@Test
	void htmlTagDefaultInheritedConstructorSingleWord() {
		String greeting = "Hello";
		HtmlGreeter testGreet = new HtmlGreeter(greeting);
		String name = "Bob";
		String actual = testGreet.greet(name);
		assertEquals("<h1>Hello, Bob!</h1>", actual);
	}
	
	
	@Test
	void htmlTagDefaultInheritedConstructorMultiWord() {
		String greeting = "Ahoy there";
		HtmlGreeter testGreet = new HtmlGreeter(greeting);
		String name = "Bobby Boy";
		String actual = testGreet.greet(name);
		assertEquals("<h1>Ahoy there, Bobby Boy!</h1>", actual);
	}
	
	
	@Test
	void htmlTagPassedToConstructor() {
		String greeting = "Hello";
		String htmlTag = "h3";
		HtmlGreeter testGreet = new HtmlGreeter(greeting, htmlTag);
		String name = "Bob";
		String actual = testGreet.greet(name);
		assertEquals("<h3>Hello, Bob!</h3>", actual);
	}
	
	@Test
	void ChineseHtmlTagPassedToConstructor() {
		String greeting = "干什么";
		String htmlTag = "body";
		HtmlGreeter testGreet = new HtmlGreeter(greeting, htmlTag);
		String name = "嘎嘎小姐";
		String actual = testGreet.greet(name);
		assertEquals("<body>干什么, 嘎嘎小姐!</body>", actual);
	}
}
