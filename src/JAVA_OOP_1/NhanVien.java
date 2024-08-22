package JAVA_OOP_1;

public class NhanVien {
    String name = "Nguyễn Văn An";
    int age = 33;
    int experience = 3;

    public static String jobTitle = "Manual Tester";
    static String companyName = "Dragon Fly ., Ltd Company";
    static String address = "Cầu Giấy, Hà Nội";

    public void getInfoEmployee(){
        System.out.println("Thông tin nhân viên là:");
    }

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.getInfoEmployee();
        System.out.println(nhanVien.name);
        System.out.println(nhanVien.age);
        System.out.println(nhanVien.experience);
        System.out.println(jobTitle);
        System.out.println(companyName);
        System.out.println(address);
    }
}