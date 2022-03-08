package enjoy.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class App extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class,args);
    }
    protected SpringApplicationBuilder configure(SpringApplicationBuilder build){
        return build.sources(App.class);
    }
}
