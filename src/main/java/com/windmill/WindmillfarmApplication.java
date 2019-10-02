
package com.windmill;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author JEYALAKSHMIV
 *
 */
@SpringBootApplication
public class WindmillfarmApplication extends SpringBootServletInitializer{
	  @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(WindmillfarmApplication.class);
	    }
	 
	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(WindmillfarmApplication.class, args);
	    }
}
