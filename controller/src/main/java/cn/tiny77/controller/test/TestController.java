package cn.tiny77.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import redis.clients.jedis.Jedis;

@Controller
public class TestController {
	
	@Autowired
	private Jedis jedis;
	
	@GetMapping("test")
	public String test(Model model) {
		String key = jedis.get("id");
		if(key==null) jedis.set("id", "0");
		else jedis.incr("id");
		key = jedis.get("id");
		model.addAttribute("id", key);
		return "test";
	}
	
}
