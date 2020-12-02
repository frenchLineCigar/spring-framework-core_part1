package me.frenchline.springapplicationcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 자바 설정 파일을 사용한 Spring Bean 등록 방법
 */
@Configuration
@ComponentScan(basePackageClasses = DemoApplication.class) //해당 클래스가 위치한 곳부터 컴포넌트 스캐닝
public class ApplicationConfig {

}
