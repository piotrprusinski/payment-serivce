package pl.com.agora.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class PaymentMainClass{
	public static void main(String[] args) {
        SpringApplication.run(PaymentMainClass.class, args);
    }
}

