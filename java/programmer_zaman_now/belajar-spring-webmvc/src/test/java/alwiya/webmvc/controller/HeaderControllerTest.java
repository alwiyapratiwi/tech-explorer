package alwiya.webmvc.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.MockMvcBuilder.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.hamcrest.Matchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class HeaderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHeaderOk() throws Exception {

        mockMvc.perform(
            get("/header/token")
            .header("X-TOKEN", "Alwiya")
        ).andExpectAll(
            status().isOk(),
            content().string(Matchers.containsString("OK"))
        );

    }

    @Test
    void testHeaderKo() throws Exception {

        mockMvc.perform(
            get("/header/token")
            .header("X-TOKEN", "SALAH")
        ).andExpectAll(
            status().isOk(),
            content().string(Matchers.containsString("KO"))
        );

    }

}
