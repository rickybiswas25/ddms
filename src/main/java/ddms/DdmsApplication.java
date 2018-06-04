package ddms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import javax.faces.webapp.FacesServlet;

/**
 * Created by Deb
 * Date : 11/05/2018.
 */
@SpringBootApplication
@ComponentScan({"ddms"})
public class DdmsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DdmsApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        FacesServlet servlet = new FacesServlet();
        return new ServletRegistrationBean(servlet, "*.jsf");
    }

    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }

}
