package alwiya.webmvc.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import alwiya.webmvc.model.User;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.MockMvcBuilder.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.hamcrest.Matchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getUser() throws Exception {

        mockMvc.perform(
            get("/user/current")
                .sessionAttr("user", new User("alwiya"))
                
        ).andExpectAll(
            status().isOk(),
            content().string(Matchers.containsString("Hello alwiya"))
        );

    }

    @Test
    void getUserInvalid() throws Exception {

        mockMvc.perform(
            get("/user/current")
                
        ).andExpectAll(
            status().is3xxRedirection()
        );

    }
}
