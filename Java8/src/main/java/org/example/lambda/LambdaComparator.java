package org.example.lambda;

import java.util.*;

public class LambdaComparator {

    static List<Employee> empList = Arrays.asList(
            new Employee(1, "Shashank"),
            new Employee(2, "Nisith"),
            new Employee(3, "Radhika"));

    public static void main(String[] args) {
        Comparator<Employee> comp= (Employee e1, Employee e2) -> {
            return (e1.getName().compareTo(e2.getName()));
        };

        Collections.sort(empList,comp);
        empList.forEach( e -> System.out.println("Employee "+e.getName()));
    }

}

 class Employee{

    private Integer id;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     private String name;

     public Employee(Integer id, String name) {
         this.id = id;
         this.name = name;
     }

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }


     @Override
     public boolean equals(Object obj) {

         if(obj == this){
             return true;
         }

         if(!(obj instanceof  Employee)){
             return false;
         }

         Employee empObj =(Employee)obj;
         return this.id ==empObj.id && this.name.equals(empObj.name);
     }
 }
