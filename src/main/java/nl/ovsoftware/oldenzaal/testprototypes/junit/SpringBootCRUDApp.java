package nl.ovsoftware.oldenzaal.testprototypes.junit;

import nl.ovsoftware.oldenzaal.testprototypes.junit.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"nl.ovsoftware.oldenzaal.testprototypes.junit"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootCRUDApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);
	}
}
