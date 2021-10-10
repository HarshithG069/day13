package com.company;

public class Extended {
    public static Object myMethod(String name, int age , double salary) {
        System.out.println(name+ " " + age+ " " +salary);
        return null;
    }

    public static void main(String[] args) {
        System.out.println(myMethod("Liam", 5 ,485325.2));
        System.out.println(myMethod("Jenny", 8, 28662.2));
        System.out.println(myMethod("Anja", 31 ,3000.0));
    }
}

