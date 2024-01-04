package alwiya.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "alwiya.spring.core.configuration"
})
public class ScanConfiguration {
    
}
