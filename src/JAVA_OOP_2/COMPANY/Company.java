package JAVA_OOP_2.COMPANY;

import JAVA_OOP_2.PERSON.Person;

public class Company {

    public static void main(String[] args) {

        Person person = new Person("Nguyễn Ngọc Bình An", 30, "Female", "Ha Noi", "0123456789");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
