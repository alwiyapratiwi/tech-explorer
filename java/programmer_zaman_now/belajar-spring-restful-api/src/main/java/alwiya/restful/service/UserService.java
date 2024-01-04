package alwiya.restful.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import alwiya.restful.entity.User;
import alwiya.restful.model.RegisterUserRequest;
import alwiya.restful.repository.UserRepository;
import alwiya.restful.security.BCrypt;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private Validator validator;

    // pakai void karena tidak ada response untuk register nya, cuma ok aja
    @Transactional
    public void register(RegisterUserRequest request) {
        Set<ConstraintViolation<RegisterUserRequest>> constraintViolations = validator.validate(request);
        if(constraintViolations.size() != 0) {
            throw new jakarta.validation.ConstraintViolationException(constraintViolations);
        }

        if(userRepository.existsById(request.getUsername())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already registered");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
        user.setName(request.getName());

        userRepository.save(user);
    
    }
    
}
