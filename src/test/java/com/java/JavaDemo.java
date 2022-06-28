package com.java;

class Wrok {

    void getData() {

        System.out.println("I am an Engineer");
    }

}

public class JavaDemo extends Wrok {

    void getData() {

        System.out.println("I am a Doctor");
    }

    public static void main(String[] args) {

        JavaDemo javaDemo = new JavaDemo();

        javaDemo.getData();


    }
}
