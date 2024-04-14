package org.subhajit.Service;

import org.junit.jupiter.api.*;
import org.subhajit.service.CalculatorService;

public class CalculatorServiceTest {
    @BeforeAll
    public static void init(){
        System.out.println("starting point of all test cases");
    }
    @BeforeEach
    public void beforeEach()
    {
        System.out.println("before test case");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("after test case");
    }
    @Test
    public void divideTest()
    {
        System.out.println("1st test case");
        int sum=CalculatorService.divide(44,22);
        int expected=2;
        Assertions.assertEquals(expected,sum,"test fails");
    }
    @Test
    public void addNumberTest()
    {
        System.out.println("2nd test case");
        int sum=CalculatorService.addNumber(12,22);
        int expected=34;
        Assertions.assertEquals(expected,sum,"test fails");
    }
    @Test
    public void productTest(){
        System.out.println("3rd test case");
        int product=CalculatorService.product(2,22);
        int expected=44;
        Assertions.assertEquals(expected,product,"test fails");
    }
    @Test
    public void sumOfSomeNumbersTest()
    {
        System.out.println("4th test case");
        int sum=CalculatorService.sumOfSomeNumbers(12,2,3,4,5);
        int expected=26;
        Assertions.assertEquals(expected,sum,"test fails");
    }
    @AfterAll
    public static void cleanup(){
        System.out.println("ending of all test cases");
    }
}
