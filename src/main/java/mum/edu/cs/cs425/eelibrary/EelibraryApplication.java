package mum.edu.cs.cs425.eelibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("mum.edu.cs.cs425.eelibrary")
public class EelibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EelibraryApplication.class, args);
	}

}
