package in.indigenous.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAutoConfiguration()
@ComponentScan(basePackages = { "in.indigenous.web" })
@SpringBootApplication
@EnableScheduling
public class Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	}
}
