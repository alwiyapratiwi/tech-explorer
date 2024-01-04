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
public class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;
    
    @Test
    void createPerson() throws Exception {

        mockMvc.perform(
            post("/person")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)   
                .param("firstName", "Alwiya")
                .param("middleName", "Pratiwi")
                .param("lastName", "Programmer")
                .param("email", "alwiya@gmail.com")
                .param("phone", "08123456789")
// nested model
                .param("address.street", "Jalan Belum Jadi")
                .param("address.city", "Jakarta")
                .param("address.country", "Indonesia")
                .param("address.postalCode", "11111")

// list
                .param("hobbies[0]", "Coding")
                .param("hobbies[1]", "Reading")
                .param("hobbies[2]", "Gaming")
                .param("socialMedia[0].name", "Facebook")
                .param("socialMedia[0].location", "facebook.com/alwiya")
                .param("socialMedia[1].name", "Instagram")
                .param("socialMedia[1].location", "instagram.com/alwiya")

        ).andExpectAll(
            status().isOk(),
            content().string(Matchers.containsString("Success create person Alwiya Pratiwi Programmer " + 
            "with email alwiya@gmail.com and phone 08123456789 " +
            "with Address Jalan Belum Jadi, Jakarta, Indonesia, 11111"))
        );

    }

    @Test
    void createPersonValidationError() throws Exception {

        mockMvc.perform(
            post("/person")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("middleName", "Pratiwi")
                .param("lastName", "Programmer")
                .param("email", "alwiya@gmail.com")
                .param("phone", "08123456789")
// nested model
                .param("address.street", "Jalan Belum Jadi")
                .param("address.city", "Jakarta")
                .param("address.country", "Indonesia")
                .param("address.postalCode", "11111")

// list
                .param("hobbies[0]", "Coding")
                .param("hobbies[1]", "Reading")
                .param("hobbies[2]", "Gaming")
                .param("socialMedia[0].name", "Facebook")
                .param("socialMedia[0].location", "facebook.com/alwiya")
                .param("socialMedia[1].name", "Instagram")
                .param("socialMedia[1].location", "instagram.com/alwiya")

        ).andExpectAll(
            status().isBadRequest(),
            content().string(Matchers.containsString("You send invalid data"))
        );

    }
}
