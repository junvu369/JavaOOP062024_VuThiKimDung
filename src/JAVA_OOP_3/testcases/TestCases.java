package JAVA_OOP_3.testcases;

import JAVA_OOP_3.common.BaseTest;

public class TestCases extends BaseTest {

    static String url1 = "https://cms.anhtester.com/login";
    static String email = "admin@example.com";
    static String password = "123456";
    private String url2;
    private boolean checkFieldsEmpty;

    //(1) Test case "Login"

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public void Login() {
        //Create the driver
        System.out.println("Open the browser:");
        BaseTest.createDriver();

        //Go to URL
        System.out.println("Step 1: Go to URL: " + url1);

        //Input Email and Password
        System.out.println("Step 2.1: Input email: " + email);
        System.out.println("Step 2.2: Input password: " + password);

        //Tap on Login button
        System.out.println("Step 3: Tap on Log in button");

        //Check if the Login is successful or not
        setUrl2("https://cms.anhtester.com/admin");
        if (url2 == getUrl2()) {
            System.out.println("Show the message: Log in successfully");
        } else {
            System.out.println("Show the message: Invalid Login credentials, then clear the email and password automatically");
        }
        //Close driver
        BaseTest.closeDriver();
    }

    // (2) Test case "Add Category"

    public boolean isCheckFieldsEmpty() {
        return checkFieldsEmpty;
    }

    public void AddCategory() {
        //Create the driver
        System.out.println("Open the browser:");
        BaseTest.createDriver();

        //Go to URL
        System.out.println("Step 1: Go to URL: " + url1);

        //Input Email and Password
        System.out.println("Step 2.1: Input email: " + email);
        System.out.println("Step 2.2: Input password: " + password);

        //Tap on Login button
        System.out.println("Step 3: Tap on Log in button");

        //Check if the Login is successful or not
        setUrl2("https://cms.anhtester.com/admin");
        if (url2 == getUrl2()) {
            System.out.println("Show the message: Log in successfully");
        } else {
            System.out.println("Show the message: Invalid Login credentials, then clear the email and password automatically");
        }
        //In Dashboard, go to Product.
        System.out.println("Step 4: From the Dashboard, Tap on Product inside the Main Menu in the left side of screen");

        //Choose Category
        System.out.println("Step 5: Tap to choose Category from the list inside Product");

        //Tap on Add New Category button
        System.out.println("Step 6: Tap on Add New Category button");

        //Input the data into the form
        System.out.println("Step 7: Input and choose the data inside the form (Name, Parent Category, Ordering Number, Type, Banner (200x200), Icon (32x32), Meta Title, Meta description and Filtering Attributes)");

        //Tap on Save button
        System.out.println("Step 8: Tap on Save button");

        //Check if the adding category is successful or not
        if (isCheckFieldsEmpty() == false) {
            System.out.println("Show the message: Create the new category successfully");
        } else {
            System.out.println("Show the message in each field: Please fill out this field.");
        }

        //Close the driver
        BaseTest.closeDriver();
    }

    public static void main(String[] args) {
        TestCases tc = new TestCases();
        System.out.println("Run test cases for Login");
        tc.Login();
        System.out.println("===========================");
        System.out.println("Run test cases for Adding Category");
        tc.AddCategory();
    }

}
