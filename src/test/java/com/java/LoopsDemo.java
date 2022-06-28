package com.java;

public class LoopsDemo {

    void whileLoopDemo() {

        int i = 0;
        while (i <= 10) {

            System.out.println(i);

            i++;
        }
        System.out.println("**************************");
    }

    void forLoopDemo() {

        for (int i = 0; i <= 10; i++) {

            System.out.println(i);
        }
        System.out.println("**************************");
    }

    void DowhileLoop() {
        int i = 0;
        do {

            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println("**************************");
    }

    void forEachDemo() {

        int i = 0;

        for (; i <= 10; i++) {

            System.out.println(i);
        }
        System.out.println("**************************");
    }

    public static void main(String[] args) {

        LoopsDemo loopsDemo = new LoopsDemo();
        loopsDemo.DowhileLoop();
        loopsDemo.forLoopDemo();
        loopsDemo.whileLoopDemo();
        loopsDemo.forEachDemo();
    }
}
