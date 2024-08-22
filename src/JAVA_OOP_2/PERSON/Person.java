package JAVA_OOP_2.PERSON;

public class Person {

    public String name;
    public int age;
    public String gender;
    String address;
    String phone;

    //Hàm xây dựng không có tham số
    public Person() {
        name = "Vũ Ngọc Minh Anh";
        age = 27;
        gender = "Female";
        address = "Hai Bà Trưng, Hà Nội";
        phone = "0123456789";
    }

    public static void main(String[] args) {
        Person getInfo = new Person();
        System.out.println(getInfo.name);
        System.out.println(getInfo.age);
        System.out.println(getInfo.gender);
        System.out.println(getInfo.address);
        System.out.println(getInfo.phone);
    }
}


    // Hàm xây dựng có tham số
//    public Person(String address, String phone) {
//        this.address = address;
//        this.phone = phone;
//    }
//
//    public static void main(String[] args) {
//
//        Person person = new Person("Thanh Xuân, Hà Nội","0999999999" );
//        System.out.println(person.address);
//        System.out.println(person.phone);
//
//        Person person1 = new Person("Hai Bà Trưng, Hà Nội", "0888888888");
//        System.out.println(person1.address);
//        System.out.println(person1.phone);
//    }
//}