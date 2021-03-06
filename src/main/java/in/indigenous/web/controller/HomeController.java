package in.indigenous.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	private Environment env;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("qaurl", env.getProperty("qa.url"));
		model.addAttribute("pmurl", env.getProperty("pm.url"));
		return "home";
	}
}
