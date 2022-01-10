package com.davault.aop.exe;

import com.davault.aop.bo.SomeBO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//https://www.youtube.com/watch?v=m15TMDt31qc
//This is the annotation or aspectJ method for doing AOP
public class AopRefresherApplication {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        SomeBO bo = ac.getBean("bo", SomeBO.class);
        bo.Validate();
        try{
            bo.Validate(17);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

}

