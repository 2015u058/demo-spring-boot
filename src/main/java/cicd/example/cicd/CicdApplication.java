package cicd.example.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello shubham bhai";

	}
}
