package JAVA_OOP_1;

public class ThongTin {

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.getInfoEmployee();
        System.out.println(nhanVien.name);
        System.out.println(nhanVien.experience);
        System.out.println(nhanVien.age);

        System.out.println(NhanVien.jobTitle);
        System.out.println(NhanVien.companyName);
        System.out.println(NhanVien.address);
    }
}
