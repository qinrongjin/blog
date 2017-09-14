package cn.tiny77.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("register")
public class RegisterController {

	@GetMapping("registerPage")
	public String registerPage() {
		return "register/registerPage";
	}
	
}
