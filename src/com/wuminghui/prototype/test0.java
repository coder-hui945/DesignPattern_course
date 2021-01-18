package com.wuminghui.prototype;

/**
 * @autor huihui
 * @date 2020/12/24 - 9:44  测试super的用法：子类中作用于变量，方法，构造器
 */
class person {
    public int age = 25;

    person() {
        System.out.println("person......");
    }

    public void show() {
        System.out.println("show person.....");
    }
}

class student extends person {
    public int age = 12;

    student() {
        //super();
        System.out.println("student...." + super.age);
    }
    public void show(){
        super.show();
        System.out.println("show student.....");
    }
}

public class test0 {
    public static void main(String[] args) {
        student student = new student();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        student.show();
    }
}
