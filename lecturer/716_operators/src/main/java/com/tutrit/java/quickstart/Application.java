package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.service.OperatorService;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger("main");
        if(args.length > 1) {
            String command = args[0];
            switch (command) {
                case "sum":
                    if(args.length >= 3) {
                        OperatorService operatorService = new OperatorService();
                        operatorService.run(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                    }
                    break;
                default:
                    log.info("{} not supported", command);
            }
        }

    }

    private void propertiesExample(String[] args) {

        Properties properties = new Properties();
        for (String prop: args) {
            String[] pair = prop.split("=");
            properties.put(pair[0], pair[1]);
        }

        Logger log = LoggerFactory.getLogger("main");
        log.info(properties.getProperty("Name"));
        log.info(properties.getProperty("LastName"));
    }
}

