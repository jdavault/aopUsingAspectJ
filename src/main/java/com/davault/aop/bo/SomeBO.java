package com.davault.aop.bo;

public class SomeBO {
    public void  Validate(){
        System.out.println("Validation stuff from Business Object.");
    }

    public void  Validate(int age) throws Exception{
        if(age<18){
            throw new ArithmeticException("not a valid age");
        }else{
            System.out.println("Age is fine, vote confirmed.");

        }
    }
}
