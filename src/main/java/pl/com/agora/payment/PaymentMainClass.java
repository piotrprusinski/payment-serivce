package pl.com.agora.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import pl.com.agora.payment.error.ErrorHandleEmbeddedServletContainerCustomizer;

@EnableAutoConfiguration
@ComponentScan
public class PaymentMainClass {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMainClass.class, args);
	}

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer() {
		return new ErrorHandleEmbeddedServletContainerCustomizer();
	}

}
