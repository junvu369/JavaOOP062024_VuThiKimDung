package JAVA_OOP_3.common;

public class BaseTest {

    //Create driver
    //Cách 1
    public void createDriver() {
        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    //Cách 2
    public void createDriver(String browser) {
        System.out.println("Browser: " + browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    //Close driver
    //Cách 1
    public static void closeDriver() {
        System.out.println("Closed Browser: " + Constants.browser);

    }

    //Cách 2
    public static void closeDriver(String browser) {
        System.out.println("Closed Browser: " + browser);
    }
}

