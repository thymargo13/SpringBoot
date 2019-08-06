package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController<Greeting> {
	
	
	@RequestMapping({"/","/hello"})
	public String index(Model model, @RequestParam(value="name", defaultValue="World") String name) {
		model.addAttribute("name",name);
		return "Hello";
	}
}
