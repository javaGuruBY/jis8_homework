package github.kaydunovdenis.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HumanService {
    Logger log = LoggerFactory.getLogger("HumanService");

    public String createUser() {
        String result = "{this is returned value}";
        log.info("{}", this.currentMethod());
        return result;
    }

    public void updateUser() {
        log.info("{}", this.currentMethod());
    }

    public void riskyOperationOnUser() throws Exception {
        log.info("{}", this.currentMethod());
        throw new Exception("exception on riskyOperationOnUser");

    }

    public void simpleOperationOnUser(String firstName, String lastName) {
        log.info("{}: firstName={}, lastName={}",
                this.currentMethod(),
                firstName,
                lastName);
    }

    private String currentMethod() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
