package study.seonghye.chapter29.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc  내가 모든걸 설정하고 싶을때
public class WebConfig implements WebMvcConfigurer {
}
