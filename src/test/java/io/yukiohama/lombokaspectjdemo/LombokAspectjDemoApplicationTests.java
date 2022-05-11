package io.yukiohama.lombokaspectjdemo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class LombokAspectjDemoApplicationTests {

    @Test
    void postTest(@Autowired MockMvc mvc) throws Exception {
        mvc.perform(post("/")).andExpect(status().isOk()).andExpect(content().string("{\"id\":1}"));
    }

}
