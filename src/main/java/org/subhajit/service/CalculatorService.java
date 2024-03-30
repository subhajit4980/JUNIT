package org.subhajit.service;

public class CalculatorService {
    public  int addNumber(int a ,int b)
    {
        return a + b;
    }
    public int product(int a ,int b)
    {
        return a * b;
    }
    public int divide(int a ,int b)
    {
        return a / b;
    }
    public  int sumOfSomeNumbers(int ... numbers){
        int sum=0;
        for(int i:numbers)
        {
            sum+=i;
        }
        return sum;
    }
}
