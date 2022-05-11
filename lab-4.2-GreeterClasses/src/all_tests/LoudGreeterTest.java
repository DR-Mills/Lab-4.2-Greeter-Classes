package all_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import not_default_package.Greeter;
import not_default_package.LoudGreeter;

class LoudGreeterTest {

	@Test
	void noVolumeAdded() {
	String greeting = "Hello";
	LoudGreeter testGreet = new LoudGreeter(greeting);
	String name = "Bob";
	String actual = testGreet.greet(name);
	assertEquals("Hello, Bob!!", actual);
	}
	
	@Test
	void volumeAdded1x() {
	String greeting = "Hello";
	LoudGreeter testGreet = new LoudGreeter(greeting);
	String name = "Bob";
	testGreet.addVolume();
	String actual = testGreet.greet(name);
	assertEquals("Hello, Bob!!!", actual);
	}
	
	@Test
	void chineseLoudGreeterVolumeAdded10x() {
	String greeting = "您好";
	LoudGreeter testGreet = new LoudGreeter(greeting);
	String name = "李先生";
	for (int i=0; i<10; i++) {
		testGreet.addVolume();
	}
	String actual = testGreet.greet(name);
	assertEquals("您好, 李先生!!!!!!!!!!!!", actual);
	}
}
