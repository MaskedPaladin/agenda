package com.company;
import java.util.*;
import java.io.*;

class Person{
    int id;
    String name;
    String surname;
    float mass;
    int age;
    Dictionary weapons = new Hashtable();
    Person(int id, String name, String surname, float mass, int age){
        id= id;
        name = name;
        surname = surname;
        mass = mass;
        age = age;
    }
    public static void draw(Person a){
        int id = a.id;
        String name = a.name;
        String surname = a.surname;
        float mass = a.mass;
        int age = a.age;
        System.out.println(id);
        System.out.println(name);
        System.out.println(surname);
        System.out.println(mass);
        System.out.println(age);
    }
}

public class Main {
    static int nitems = 0;
    static void add(Person list, String field, String value){
        for (int i = 0; i < nitems; i++) {

        }
    }
    static void command(){
        Scanner c = new Scanner(System.in);
        System.out.print(">>> ");
        String com = c.next();
        if (com.contentEquals("add")){
            add(persons, 10, "");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < persons.length; i++) {
            persons[i] = new Person(0, null, null, 0, 0);
            nitems++1;
        }
        for (int i = 0; i < persons.length; i++) {
            System.out.println(i);
            System.out.print("Name: ");
            String name = sc.next();
            persons[i].name = name;
            System.out.println();
            System.out.print("Surname: ");
            String surname = sc.next();
            persons[i].surname = surname;
            System.out.println();
            System.out.print("Mass: ");
            float mass = sc.nextFloat();
            persons[i].mass = mass;
            System.out.println();
            System.out.print("Age: ");
            int age = sc.nextInt();
            persons[i].age = age;
        }
        System.out.println(persons[0].age);
        for (int i = 0; i < persons.length; i++) {
            Person.draw(persons[i]);
        }
    }
}