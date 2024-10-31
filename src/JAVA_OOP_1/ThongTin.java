package JAVA_OOP_1;

public class ThongTin {

    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("NV01","Nguyễn Bình An",33,"0123456789","Hai Bà Trưng, Hà Nội");
        NhanVien nhanVien2 = new NhanVien("NV02","Nguyễn Anh Minh",32,"0112233445","Thanh Xuân, Hà Nội");

        nhanVien1.showInfo();
        System.out.println("============================");
        nhanVien2.showInfo();
    }
}