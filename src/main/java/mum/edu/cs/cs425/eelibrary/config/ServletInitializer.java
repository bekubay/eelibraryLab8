package mum.edu.cs.cs425.eelibrary.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import mum.edu.cs.cs425.eelibrary.EelibraryApplication;

public class ServletInitializer extends SpringBootServletInitializer{

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EelibraryApplication.class);
	}
}
