package github.kaydunovdenis;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        SpringConfiguration configuration = new SpringConfiguration();
        configuration.init(new ClassPathXmlApplicationContext("spring-config.xml"));
    }
}