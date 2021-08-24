package com.tutrit.java.javautil.service;

import com.tutrit.java.javautil.bean.Course;
import com.tutrit.java.javautil.bean.Human;
import com.tutrit.java.javautil.bean.Robot;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddNewClient implements Runnable {
    Logger log = LoggerFactory.getLogger("AddNewClient");

    @Override
    public void run() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            log.info("add new Client type and name:");
            add(sc.nextLine());
        }
    }

    private void add(String nextLine) {
        String[] command = nextLine.split(" ");
        switch (command[0]) {
            case "robot":
                new Course().addObserver(new Robot(command[1]));
                break;
            case "human": {
                new Course().addObserver(new Human(command[1]));
            }
            default:
                log.error("unsupported command");
        }
    }
}
