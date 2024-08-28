package JAVA_OOP_3.common;

public class BaseTest extends Constants {


    public static void createDriver() {
        Constants.GetInfo();
    }

    public static void closeDriver() {
        Constants c = new Constants();
        System.out.println("Closed browser: " + c.getBrowser());
    }

    public static void main(String[] args) {
        BaseTest.createDriver();
        BaseTest.closeDriver();
    }
}
