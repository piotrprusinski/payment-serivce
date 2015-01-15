package pl.com.agora.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;

@RestController
public class PayForController {

	@Autowired
	MetricRegistry metrics;

	@RequestMapping("/payfor")
	@ResponseBody
	public String payFor(@RequestParam String id) {
		Meter samplerequest = metrics.meter("samplerequest");
		samplerequest.mark();
		return "ok";
	}
}
