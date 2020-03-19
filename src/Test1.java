import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 20 && age < 30)
            this.age = age;
    }

    public void study() {
        System.out.println(name + " " + age + " " + "study");
    }

}

class Teacher {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 30 && age < 70) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println(name + " " + age + " " + "teach");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名：");
        s.setName(scanner.next());
        System.out.println("输入年龄：");
        s.setAge(scanner.nextInt());
        s.study();
        Teacher t = new Teacher();
        System.out.println("输入姓名：");
        t.setName(scanner.next());
        System.out.println("输入年龄：");
        t.setAge(scanner.nextInt());
        t.teach();
    }

}
