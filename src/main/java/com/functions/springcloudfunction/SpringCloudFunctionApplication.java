package com.functions.springcloudfunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionApplication.class, args);
    }

/*    public interface Function<T,R>{
        R apply(T t);
    }

    public interface Consumer<T> {
        void accept(T t);
    }

    public interface Supplier<T>{
        T get();
    }*/

    @Bean
    public Function<String, String> reverseString(){
        return (input) -> new StringBuilder(input).reverse().toString();
    }

    @Bean
    public Supplier<Book> getBook(){
        return () -> new Book(101,"JAVA");
    }

    @Bean
    public Consumer<String> printMessage(){
        return (message) -> System.out.println(message);
    }
}
