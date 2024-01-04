package alwiya.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import alwiya.spring.core.data.Bar;
import alwiya.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy               // akan dijalankan ketika akan diakses/dibutuhkan saja
    @Bean
    @DependsOn({        // yang akan dijalankan lebih dulu
        "bar"
    })
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }
    
}
