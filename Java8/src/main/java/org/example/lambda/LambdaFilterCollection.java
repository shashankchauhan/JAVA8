package org.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaFilterCollection {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));

        Stream<Product> filterData = list.stream().filter(p -> p.price > 20000);

        filterData.forEach(p -> System.out.println(p.name+""+p.price));

        list.stream().filter((p) -> p.name.startsWith("Iphone")).map((p) -> p.name.toUpperCase())
                .sorted().forEach(p -> System.out.println("Values "+p));

        list.stream().map((p) -> p.getName().toLowerCase()).forEach(p -> System.out.println("map value "+p));


    }
}

class Product{

    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
