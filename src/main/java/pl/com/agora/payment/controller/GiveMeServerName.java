package pl.com.agora.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GiveMeServerName {

	@Value("${nameserver}")
	private String name;

	@RequestMapping("/name")
	public String getName() {
		return name;
	}
}
