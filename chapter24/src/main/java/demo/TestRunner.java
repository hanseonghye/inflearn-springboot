package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {
    private Logger logger = LoggerFactory.getLogger(Application.class);


    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("======info=====");
        logger.debug("========debug========");
        System.out.println("sysout");
        System.out.println("sysout");
        System.out.println("sysout");
    }
}
