package com.mab.cs_prep;

import com.mab.cs_prep.mocks.example.UserController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class CsPrepApplication {

    public static void main(String[] args) {

        //ToDo: Create tests instead of this.
        ApplicationContext ctx = SpringApplication.run(CsPrepApplication.class, args);

        UserController userController = (UserController) ctx.getBean("userController");
        log.info("Users retrieved from the user service: {}", userController.getUsers());
    }
}
