package cn.tiny77.controller.user;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tiny77.dpi.user.User;

@Controller
@RequestMapping("register")
public class RegisterController{

	@GetMapping("registerPage")
	public String registerPage(Model model,User user) {
		model.addAttribute("user", user);
		return "register/registerPage";
	}
	
	@PostMapping("register")
	public String register(Model model,@Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute("user", user);
			return "register/registerPage";
		}
		return "register/sendEmail";
	}
	
}
