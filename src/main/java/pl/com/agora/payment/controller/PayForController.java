package pl.com.agora.payment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayForController {

	@RequestMapping("/payfor")
	@ResponseBody
	public String payFor(@RequestParam String id) {
		return "ok";
	}
}
