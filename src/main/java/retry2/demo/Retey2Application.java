package retry2.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class Retey2Application {

	public static void main(String[] args) {
		SpringApplication.run(Retey2Application.class, args);
	}

}
