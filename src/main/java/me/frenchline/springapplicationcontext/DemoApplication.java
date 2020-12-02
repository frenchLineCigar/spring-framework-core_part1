package me.frenchline.springapplicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

    //@SpringBootApplication이 붙어있다면 ApplicationContext도 스프링이 알아서 만들어 준다
    //@SpringBootApplication 안에 @ComponentScan, @Configuration이 다 포함되어 있다
    //@SpringBootApplication이 붙어있는 현재 클래스 자체가 사실상 Bean 설정 파일이다.
    //이전에 만든 ApplicationConfig이 사실 필요없게 된다

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println(bookService.bookRepository != null); //DI
    }
}
