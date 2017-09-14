package cn.tiny77.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.alibaba.druid.stat.TableStat.Mode;

import cn.tiny77.dpi.test.User;
import redis.clients.jedis.Jedis;

@Controller
public class TestController {
	
	@Autowired
	private Jedis jedis;
	
	@GetMapping("test")
	public String test(Model model) {
		model.addAttribute("user", new User());
		return "test";
	}
	
	@PostMapping("test")
	public String testPost(Model model, User  user) {
		model.addAttribute("user", user);
		user.setFirstName(user.getFirstName().toUpperCase());
		user.setLastName(user.getLastName().toUpperCase());
		return "test";
	}
	
}
