package com.tutrit.springcorequickstart.util;

import com.tutrit.springcorequickstart.Application;
import com.tutrit.springcorequickstart.bean.Project;
import com.tutrit.springcorequickstart.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public final class MyUtilita {

  private static MyService myService = Application.applicationContext.getBean(MyService.class);

  private MyUtilita() {
  }

  public static String convertToString(Object obj) {
    myService.run();
    return obj.toString().substring(3);
  }

}
