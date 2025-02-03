package com.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCoupling {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("userConstructorInjection.xml");

        UserManager userManagerWithDb = (UserManager) context.getBean("userManagerWithDB");
        System.out.println(userManagerWithDb.getUserInfo());

        UserManager userManagerWithWebService = (UserManager) context.getBean("userManagerWithWebService") ;
        System.out.println(userManagerWithWebService.getUserInfo());

        UserManager userManagerWithNewDB = (UserManager) context.getBean("userManagerWithNewDB");
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}