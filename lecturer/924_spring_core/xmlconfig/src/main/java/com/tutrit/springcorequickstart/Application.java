package com.tutrit.springcorequickstart;

import com.tutrit.springcorequickstart.bean.Developer;
import com.tutrit.springcorequickstart.bean.Project;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static Logger log = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
    Map<String, Developer> developerMap = ctx.getBeansOfType(Developer.class);
    Project project = ctx.getBean(Project.class);

    log.info("developer is {}", developerMap);
  }
}
