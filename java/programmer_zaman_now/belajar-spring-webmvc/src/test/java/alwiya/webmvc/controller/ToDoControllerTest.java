package alwiya.webmvc.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.MockMvcBuilder.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.hamcrest.Matchers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ToDoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testAddToDo() throws Exception {

        mockMvc.perform(
            post("/todos")
            .accept(MediaType.APPLICATION_JSON)
            .param("todo", "Alwiya")
        ).andExpectAll(
            status().isOk(),
            content().string(Matchers.containsString("Alwiya"))
        );

    }

    @Test
    void testGetToDo() throws Exception {

        mockMvc.perform(
            get("/todos")
            .accept(MediaType.APPLICATION_JSON)
        ).andExpectAll(
            status().isOk(),
            content().string(Matchers.containsString("Alwiya"))
        );

    }
}
