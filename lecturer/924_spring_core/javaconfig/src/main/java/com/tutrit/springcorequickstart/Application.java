package com.tutrit.springcorequickstart;

import com.tutrit.springcorequickstart.bean.Developer;
import com.tutrit.springcorequickstart.bean.Project;
import com.tutrit.springcorequickstart.config.MyConfig;
import com.tutrit.springcorequickstart.controller.MyController;
import com.tutrit.springcorequickstart.util.MyUtilita;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
  public static ApplicationContext applicationContext;

  public static Logger log = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
    Application.applicationContext = ctx;
    MyUtilita.convertToString(new Object());
    Map<String, Developer> developerMap = ctx.getBeansOfType(Developer.class);
    Project project = ctx.getBean(Project.class);
    MyController myController = ctx.getBean(MyController.class);
    log.info("developer is {}", developerMap);
  }
}
