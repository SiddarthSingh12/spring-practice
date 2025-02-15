package com.example.componentscan;

import com.example.autowire.name.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class App {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanDemo.xml");
        Employee employee = context.getBean("employee1", Employee.class);
        System.out.println(employee.toString());
    }
}
