package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.bean.Human;
import com.tutrit.java.quickstart.service.HumanService;

public class Application {

    public static void main(String[] args) {
        Human human = new Human("Cubert", 40);

        HumanService humanService = new HumanService();

        humanService.greet(human.getName(), human.getAge());
    }
}
