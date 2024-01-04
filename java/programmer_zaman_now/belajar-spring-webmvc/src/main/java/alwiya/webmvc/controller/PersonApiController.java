package alwiya.webmvc.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import alwiya.webmvc.model.CreatePersonRequest;
import jakarta.validation.Valid;

@Controller
public class PersonApiController {

    @PostMapping(
        path = "/api/person",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseBody
    public CreatePersonRequest createPerson(@RequestBody @Valid CreatePersonRequest request) {
        return request;
    }
    
}
