package com.mab.mocks;

import com.mab.mocks.qualified.example.UserController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class MocksApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(com.mab.mocks.MocksApplication.class, args);

        UserController userController = (UserController) ctx.getBean("userController");
        log.info("Users retrieved from the user service: {}", userController.getUsers());
    }
}
