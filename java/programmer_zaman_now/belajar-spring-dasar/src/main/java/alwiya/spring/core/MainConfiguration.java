package alwiya.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import alwiya.spring.core.configuration.BarConfiguration;
import alwiya.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
    
}
