package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.akademiakodu.model.Company;
import pl.akademiakodu.model.OnePersonCompany;

@SpringBootApplication
public class DiSpringApplicationRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DiSpringApplicationRunner.class, args);

		OnePersonCompany onePersonCompany = (OnePersonCompany) run.getBean("onePersonCompany");
		onePersonCompany.work();

		System.out.println("========");


		Company company = (Company) run.getBean("company");
		company.work();
	}
}
