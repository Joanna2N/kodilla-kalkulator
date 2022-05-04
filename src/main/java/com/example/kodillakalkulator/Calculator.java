package com.example.kodillakalkulator;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int substract(int num1, int num2) {
            return num2 - num1;
    }

public static void main(String args[]){

Calculator calculator = new Calculator();
int result = calculator.add(32, 76);
    System.out.println(result);
}
}
