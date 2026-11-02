
package com.example;

import com.component.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example", "com.component"})
public class SpringBootDemo5Application {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootDemo5Application.class, args);       
        Student bean = context.getBean("student", Student.class);
        System.out.println(bean);
        System.out.println("Grade: " + bean.getAverage());
    }
}
