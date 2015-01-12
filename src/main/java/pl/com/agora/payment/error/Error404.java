package pl.com.agora.payment.error;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Error404 {

	@RequestMapping("/404")
	public ModelAndView handle404() {
		return new ModelAndView("404");
	}
}
