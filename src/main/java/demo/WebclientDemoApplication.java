package demo;

import demo.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class WebclientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebclientDemoApplication.class, args);
	}
}
