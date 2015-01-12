package pl.com.agora.payment.error;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.http.HttpStatus;

public class ErrorHandleEmbeddedServletContainerCustomizer implements EmbeddedServletContainerCustomizer {

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		 container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404"));
	}

}
