package JAVA_OOP_3.common;

public class Constants {
    private static String browser = "Chrome";
    private static boolean report;
    private static boolean headless;

    public static String getBrowser() {
        return browser;
    }

    public static void GetInfo() {
        System.out.println(browser);
        System.out.println(report);
        System.out.println(headless);
    }
}
