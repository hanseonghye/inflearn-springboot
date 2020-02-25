package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    private String hello;

    @Autowired
    private TestProperties testProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(hello);
        System.out.println(hello);
        System.out.println(hello);

        System.out.println(testProperties.getName());
    }
}
