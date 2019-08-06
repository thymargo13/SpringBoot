package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String template = "Hello %s!";
	private final AtomicLong Counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name", defaultValue = "World") String name) {
		Greeting cxt =  new Greeting(Counter.getAndIncrement(), String.format(template, name));
		return cxt.getContent();
		}
}
