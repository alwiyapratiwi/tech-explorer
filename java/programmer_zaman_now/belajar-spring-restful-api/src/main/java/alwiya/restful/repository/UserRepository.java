package alwiya.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import alwiya.restful.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    
}
