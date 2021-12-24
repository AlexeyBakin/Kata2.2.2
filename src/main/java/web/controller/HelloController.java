package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hi, mentor!");
		messages.add("This is a puzzle about cars.");
		messages.add("Enter a GET request with the COUNT parameter.");
		model.addAttribute("messages", messages);
		return "index";
	}
}