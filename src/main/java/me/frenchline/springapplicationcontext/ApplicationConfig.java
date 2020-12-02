package me.frenchline.springapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 자바 설정 파일을 사용한 Spring Bean 등록 방법
 */
@Configuration //Bean 설정 파일
public class ApplicationConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService bookService() {
        return new BookService();
    }

}
