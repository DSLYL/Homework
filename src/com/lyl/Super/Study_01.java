package com.lyl.Super;


class Father{
    public Father(){
        System.out.println("Father is ....");
    }
}
class Child extends Father{
    public Child(){
//       如果父类的构造函数是无参数的话， 系统默认添加super();
        System.out.println("Child is...");
    }
}
public class Study_01 {
    public static void main(String[] args) {
        System.out.println("procsssing...");
        new Child();
    }

}
