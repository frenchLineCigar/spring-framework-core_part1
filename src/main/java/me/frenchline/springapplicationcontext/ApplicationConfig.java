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
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository()); //setter injection(DI)
        return bookService;
    }
//    또는 메서드 파라미터로 주입을 받을 수도 있다
//    @Bean
//    public BookService bookService(BookRepository bookRepository) {
//        BookService bookService = new BookService();
//        bookService.setBookRepository(bookRepository); //setter injection(DI)
//        return bookService;
//    }
}
