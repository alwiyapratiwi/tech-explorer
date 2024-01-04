package alwiya.spring.core;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import alwiya.spring.core.data.Bar;
import alwiya.spring.core.data.Foo;
import alwiya.spring.core.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope(value = "prototype") // dibuat object baru setiap kali bean diakses
    public Foo foo() {
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar() {
        log.info("Create new bar");
        return new Bar();
    }
    
}
