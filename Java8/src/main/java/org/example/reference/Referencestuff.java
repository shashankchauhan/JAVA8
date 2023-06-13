package org.example.reference;

public class Referencestuff {
    public static void main(String[] args) {
        System.out.println("Learning Method reference.");

        WorkInter wi = () -> {
            System.out.println("this is do task new method");
        };

        //static method reference
        //classname::methodname
        // we need object for nonstatic reference and class tor static reference
        WorkInter ref = RefrenceDoStuff::doStuff;
        ref.doTask();

        wi.doTask();
    }
}

 interface  WorkInter{
    public void doTask();
}

