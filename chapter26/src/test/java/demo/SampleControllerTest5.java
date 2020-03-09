package demo;

import demo.sample.SampleController;
import demo.sample.SampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(SampleController.class) //controller만 bean 등록
public class SampleControllerTest5 {
    @MockBean //controller bean에 service를 주입시킨다.
    SampleService sampleService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void hello() throws Exception {
        when(sampleService.getName()).thenReturn("hanseonghye");

        mockMvc.perform(get("/hello"))
                .andExpect(content().string("hello hanseonghye"));

    }
}
