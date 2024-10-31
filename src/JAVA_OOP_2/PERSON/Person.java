package JAVA_OOP_2.PERSON;

public class Person {

    public String name;
    public int age;
    public String gender;

    protected String phone;
    protected String address;

    public Person(String name, int age, String gender, String address, String phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    protected String getPhone() {
        return phone;
    }
    protected String getAddress() {
        return address;
    }
}