package mindful;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class MindfulApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = run(MindfulApplication.class, args);

//        System.out.println("Here are the beans wired up by spring boot");
//
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }
    }
}
