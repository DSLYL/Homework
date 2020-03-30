package com.lyl.test.One;

class People{
    int a=2;
    private int a1=5;
    public void show(){

        System.out.println(a);
    }

    public int getA1() {
        return a1;
    }
    public void setA1(int a1){
        this.a1=a1;
    }
}
class Student1 extends People{
    int a=3;
    void f(){
        System.out.println(a);
    }
    void play(){
        System.out.println("hhhhh"+a);
    }



}
public class Test {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setA1(55);
        System.out.println(s1.getA1());

//        s1.f();
//        s1.show();

//        People p1 = (People) s1;
//        Student1 s2 = (Student1) p1;
//        s2.play();



    }
}
