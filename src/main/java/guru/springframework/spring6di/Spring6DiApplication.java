package guru.springframework.spring6di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import guru.springframework.spring6di.controllers.MyControllers;

@SpringBootApplication
public class Spring6DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);

        MyControllers controller = ctx.getBean(MyControllers.class);

        System.out.println("In Main Method");

        System.out.println(controller.sayHello());
    }
}
