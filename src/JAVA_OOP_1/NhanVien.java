package JAVA_OOP_1;

public class NhanVien {

    //Khởi tạo các biến (không cần có tham số cụ thể)
    public String employeeID;
    public String name;
    public int age;
    public String phone;
    public String address;


    //Tạo hàm xây dựng dựa trên các biến bên trên
    public NhanVien(String employeeID, String name, int age, String phone, String address) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    //Tạo ra các hàm in thông tin
    public void showInfo() {
        System.out.println("EmployeeID: " + employeeID);
        System.out.println("Employee's name: " + name);
        System.out.println("Employee's age: " + age);
        System.out.println("Phone No.: " + phone);
        System.out.println("Address: " + address);
    }

}