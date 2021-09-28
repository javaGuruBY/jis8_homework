package com.tutrit.springcorequickstart.config;

import com.tutrit.springcorequickstart.bean.Developer;
import com.tutrit.springcorequickstart.bean.Project;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

  @Bean
  public Developer dev() {
    var developer = new Developer();
    developer.setName("Max");
    developer.setSkill("Java");
    developer.setLevel(3);
    return developer;
  }

  @Bean
  public Developer junior() {
    var developer = new Developer();
    developer.setName("JUNIOR");
    developer.setSkill("Java");
    developer.setLevel(3);
    return developer;
  }

  @Bean
  public Project project() {
    return new Project("TUTRIT.COM", junior());
  }
}
