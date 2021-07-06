package learn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(name = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam("name") String name, Model model) {
        model.addAttribute("response", name);
        return "hello";
    }
	
	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
    public String hello2(@RequestParam("name") String name, Model model) {
        model.addAttribute("response", name);
        return "welcome";
    }
	
}
