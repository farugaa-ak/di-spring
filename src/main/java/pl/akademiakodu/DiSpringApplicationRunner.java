package pl.akademiakodu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import pl.akademiakodu.model.Company;
import pl.akademiakodu.model.OnePersonCompany;
import pl.akademiakodu.model.workers.Worker;

@SpringBootApplication
public class DiSpringApplicationRunner {

	private static final Logger log = LoggerFactory.getLogger(DiSpringApplicationRunner.class);

	@Bean
	OnePersonCompany onePersonCompany(Worker multiWorker){
		return new OnePersonCompany(multiWorker);
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DiSpringApplicationRunner.class, args);
	}

	@Bean
	public CommandLineRunner startCompany(OnePersonCompany onePersonCompany, Company company) {
		return (args) -> {
			onePersonCompany.work();
			log.info("And now company !");
			company.work();
		};
	}
}
