package github.kaydunovdenis.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserService implements UserServiceI{
    Logger log = LoggerFactory.getLogger("UserService");

    @Override
    public String createUser() {
        String result = "{this is returned value}";
        log.info(">>>UserService.{}", this.currentMethod());
        return result;
    }

    @Override
    public void updateUser() {
        log.info(">>>UserService.{}", this.currentMethod());
    }

    @Override
    public void riskyOperationOnUser() throws Exception {
        log.info(">>>UserService.{}", this.currentMethod());
        throw new Exception("exception on riskyOperationOnUser");
    }

    @Override
    public void simpleOperationOnUser(String firstName, String lastName) {
        log.info(">>>UserService.{}: firstName={}, lastName={}",
                this.currentMethod(),
                firstName,
                lastName);
    }

    private String currentMethod() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
