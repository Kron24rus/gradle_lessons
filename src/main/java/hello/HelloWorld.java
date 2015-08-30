package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.LocalTime;

public class HelloWorld {

    public static Logger log = LogManager.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);

        log.error("gradle log");

		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
