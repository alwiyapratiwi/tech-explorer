package alwiya.webmvc.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import jakarta.servlet.http.Cookie;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.MockMvcBuilder.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.hamcrest.Matchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class AuthControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void loginSuccess() throws Exception {

        mockMvc.perform(
            post("/auth/login")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("username", "alwiya")
                .param("password", "rahasia")
        ).andExpectAll(
            status().isOk(),
            content().string(Matchers.containsString("OK")),
            cookie().value("username", Matchers.containsString("alwiya"))
        );

    }

    @Test
    void loginFailed() throws Exception {

        mockMvc.perform(
            post("/auth/login")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("username", "salah")
                .param("password", "salah")
        ).andExpectAll(
            status().isUnauthorized(),
            content().string(Matchers.containsString("KO"))
        );

    }

    @Test
    void getUser() throws Exception {
        mockMvc.perform(
            get("/auth/user")
                .cookie(new Cookie("username", "alwiya"))
        ).andExpectAll(
            status().isOk(),
            content().string(Matchers.containsString("Hello alwiya"))
        );
    }

}
