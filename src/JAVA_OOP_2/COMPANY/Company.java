package JAVA_OOP_2.COMPANY;

import JAVA_OOP_2.PERSON.Person;

public class Company extends Person {

    public static void main(String[] args) {

        Person employeeInfo = new Person();

        System.out.println(employeeInfo.name);
        System.out.println(employeeInfo.age);
        System.out.println(employeeInfo.gender);
    }
}
