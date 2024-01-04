package alwiya.spring.core.data.application;

import java.util.List;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import alwiya.spring.core.data.Bar;
import alwiya.spring.core.data.Foo;
import alwiya.spring.core.listener.AppStartingListener;

@SpringBootApplication
public class FooApplication {

    // public static void main(String[] args) {
    //     ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);

    //     Foo foo = applicationContext.getBean(Foo.class);
    //     System.out.println(foo);
    // }

    // CUSTOMIZING SPRING APPLICATION
    // public static void main(String[] args) {
    //     SpringApplication application = new SpringApplication(FooApplication.class);
    //     // application.setBannerMode(Banner.Mode.OFF); // custom
    //     application.setListeners(List.of(new AppStartingListener()));

    //     ConfigurableApplicationContext applicationContext = application.run(args);

    //     Foo foo = applicationContext.getBean(Foo.class);
    //     System.out.println(foo);
    // }

    @Bean
    public Foo foo() {
        return new Foo();
    }
    
}
