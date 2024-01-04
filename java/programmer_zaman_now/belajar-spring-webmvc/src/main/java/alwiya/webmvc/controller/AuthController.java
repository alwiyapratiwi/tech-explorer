package alwiya.webmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import alwiya.webmvc.model.User;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

    @PostMapping(path = "/auth/login", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<String> login (
        @RequestParam(name = "username") String username,
        @RequestParam(name = "password") String password,
        HttpServletRequest servletRequest, // untuk session
        HttpServletResponse servletResponse // untuk buat cookie
    ) {
        if("alwiya".equals(username) && "rahasia".equals(password)) {
            HttpSession session = servletRequest.getSession(true);
            session.setAttribute("user", new User(username));

            Cookie cookie = new Cookie("username", username);   // baca cookie
            cookie.setPath("/");
            servletResponse.addCookie(cookie);

            return ResponseEntity.status(HttpStatus.OK).body("OK");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("KO");
        }
    }

    // dapetin cookie -> @CookieValue
    // buat mapping baru
    @GetMapping(path = "/auth/user")
    public ResponseEntity<String> getUser(@CookieValue("username") String username) {
        return ResponseEntity.ok("Hello " + username);
    }
    
}
