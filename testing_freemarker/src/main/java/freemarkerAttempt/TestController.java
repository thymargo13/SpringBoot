package freemarkerAttempt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	@RequestMapping("/test")
	public String testFreemarker(ModelMap modelMap, @RequestParam(value="name", defaultValue="World!") String name) {
		modelMap.addAttribute("name", name);
		return "hello"; // the .ftl file name
	}
}
