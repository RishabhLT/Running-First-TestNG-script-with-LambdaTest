# Java TestNG Selenium 

### Environment Setup

1. Install TestNG from Eclipse MarketPlace
2. Inorder to rectify the error 
    ```
    org.testng.TestNGException: 
    TestNG by default disables loading DTD from unsecure Urls.
    ```
    * Right Click on the class, select **Run --> Run configuration**
    * By default one testNg class will be generated with same class name under testng option
    * Select that class and go to **Arguments** tab
    * In the VM arguments provide **-Dtestng.dtd.http=true**
    
### Running Tests

1. Just right click singleTestRunner.xml in the Java-TestNG-Selenium-master --> src --> test --> resources
2. Select Run As --> TestNG Suite
3. Check the console for any compilation error
4. If no error has occurred, go to app.lambdatest.com and Login
5. Switch to Automation tab from the left
6. You can see the test running by the name GeeksForGeeks Sample

## About LambdaTest

[LambdaTest](https://www.lambdatest.com/) is a cloud based selenium grid infrastructure that can help you run automated cross browser compatibility tests on 2000+ different browser and operating system environments. LambdaTest supports all programming languages and frameworks that are supported with Selenium, and have easy integrations with all popular CI/CD platforms. It's a perfect solution to bring your [selenium automation testing](https://www.lambdatest.com/selenium-automation) to cloud based infrastructure that not only helps you increase your test coverage over multiple desktop and mobile browsers, but also allows you to cut down your test execution time by running tests on parallel.

