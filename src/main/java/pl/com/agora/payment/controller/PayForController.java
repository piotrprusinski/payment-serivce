package pl.com.agora.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pl.com.agora.payment.dto.PayForResult;

import com.codahale.metrics.Meter;
import com.codahale.metrics.MetricRegistry;

@RestController
public class PayForController {

	@Autowired
	MetricRegistry metrics;

	@RequestMapping("/payfor")
	@ResponseBody
	public PayForResult payFor(@RequestParam String id) {
		Meter samplerequest = metrics.meter("samplerequest");
		PayForResult payForResult = new PayForResult();
		payForResult.setResult("ok");
		samplerequest.mark();
		return payForResult;		
	}
}
