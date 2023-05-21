package org.example.lambda;

public class LambdaCalculation {

    public static void main(String[] args) {

        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface funcInterface = (double x) -> System.out.println("Multiplication "+2*x);

        // This calls above lambda expression and prints 10.
        funcInterface.multipicationCalc(5);
        funcInterface.normalFun();
    }

}

// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

// A sample functional interface (An interface with
// single abstract method
interface FuncInterface{


    // An abstract function
      void multipicationCalc(double x);

    // A non-abstract (or default) function
    default  void normalFun(){
        System.out.println("Calculation Lambda Program");
    }
}
