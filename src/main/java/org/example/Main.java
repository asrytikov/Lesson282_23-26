package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        People p = context.getBean(People.class);
        System.out.println(p);
        System.out.println(p.getName());

        People x = new People();
        x.setName("Masha");

        Supplier<People> peopleSupplier = () -> x;
        context.registerBean("people1", People.class, peopleSupplier, bc -> bc.setPrimary(true));

        People x1 = context.getBean(People.class);
        System.out.println(x1.getName());
    }
}