package pl.akademiakodu.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiSpringApplication.class, args);

		AppOnePersonCompany appOnePersonCompany = new AppOnePersonCompany();
		appOnePersonCompany.start();

		App app = new App();
		app.start();
	}
}
