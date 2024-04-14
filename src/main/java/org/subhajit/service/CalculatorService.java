package org.subhajit.service;

public class CalculatorService {
    public static   int addNumber(int a ,int b)
    {
        return a + b;
    }
    public static int product(int a ,int b)
    {
        return a * b;
    }
    public static int divide(int a ,int b)
    {
        return a / b;
    }
    public static int sumOfSomeNumbers(int ... numbers){
        int sum=0;
        for(int i:numbers)
        {
            sum+=i;
        }
        return sum;
    }
}
