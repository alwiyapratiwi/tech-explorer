package alwiya.spring.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import alwiya.spring.core.repository.ProductRepository;
import lombok.Getter;

// @Scope("prototype")
// @Lazy
@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    @Autowired  // untuk memberitahu constructor mana yang akan digunakan
    // Constructor-based Dependency Injection
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }
    
}
