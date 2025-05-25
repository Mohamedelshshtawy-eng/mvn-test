package mohamed.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        // var app = new SpringApplication(TestApplication.class);
        // app.setDefaultProperties(Collections.singletonMap("spring.propertie.active", "dev"));
        // var ctx = app.run();
        // Servises servises = ctx.getBean(Servises.class);
        // System.out.println(servises.getClas());
        // System.out.println(servises.getProp());
        // System.out.println(servises.getName());
        // System.out.println(servises.getGame());
        SpringApplication.run(TestApplication.class, args);
    }

}
