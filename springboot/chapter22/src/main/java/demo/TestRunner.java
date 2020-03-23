package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    TestProperties testProperties;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(testProperties.getFullname());
        System.out.println(testProperties.getSessionTimeout());
    }
}
