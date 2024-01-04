package alwiya.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import alwiya.spring.core.data.Connection;
import alwiya.spring.core.data.Server;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    // @Bean(initMethod = "start", destroyMethod = "stop") // tidak gunakan ini lagi jika sudah menggunakan @PostConstruct dan @PreDestroy
    @Bean
    public Server server() {
        return new Server();
    }
    
}
