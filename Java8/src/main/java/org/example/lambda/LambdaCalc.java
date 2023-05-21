package org.example.lambda;

public class LambdaCalc {

    @FunctionalInterface
    interface functionOperation{
        double operation(double a, double b);
    }

    @FunctionalInterface
    interface function2{
        void sayMsg(String msg);
        default void message(){
            System.out.println("this is method body of default in functional interface.");
        }
    }

    private double operate(double a , double b,functionOperation fo ){
         return fo.operation(a,b);
    }
    public static void main(String[] args) {

        functionOperation add = (double x , double y) -> x + y;

        functionOperation mul = (double x , double y) ->  x * y;

        LambdaCalc lambdaCalc = new LambdaCalc();

        System.out.println("Addition= "+lambdaCalc.operate(4,3,add));
        System.out.println("Multiplication = "+lambdaCalc.operate(4,3,mul));

        function2 fun = message -> System.out.println("Hello "+message);
        fun.sayMsg("lambda.");
        fun.message();


    }
}
