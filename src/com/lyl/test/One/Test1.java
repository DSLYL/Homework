package com.lyl.test.One;


class Teacher{
    int id;
    String name;
    public void rest(){
        System.out.println("在办公室休息");
    }
    public void ss(){
        System.out.println("我是老大");
    }
    Teacher( String name){
        this.name = name;
        System.out.println(this.name+"哈哈哈哈哈");
    }
}

class Student extends Teacher{
    int score;
    Student(){
        super("刘芸隆");
    }
    public void play(){
        System.out.println("打游戏");
    }
    public void rest(){
        System.out.println("学生在宿舍休息");
    }

}

public class Test1 {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = (Teacher) student;
        Student student1 = (Student) teacher;
        student1.play();
        student.rest();
//        teacher.rest();
        student.score = 100;
        student.name = "lik";
//        teacher.play();

        System.out.println(student.score+student.name);
    }







}
