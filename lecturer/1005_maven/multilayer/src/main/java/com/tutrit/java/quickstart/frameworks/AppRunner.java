package com.tutrit.java.quickstart.frameworks;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AppRunner {
    MyControllerInterface myController;

    public void main(String[] arg) {
        myController.makePerson(arg);
    }
}
