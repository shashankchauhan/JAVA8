package org.example.lambda;

public class LambdaThread {

    public static void main(String[] args) {

        Runnable r= () -> {
            System.out.println("thread is running");
        };

        Thread t1 = new Thread(r);
        t1.start();
    }
}
