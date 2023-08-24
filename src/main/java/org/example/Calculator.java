package org.example;

public class Calculator {
    public int add(int a, int b) throws Exception {

        if (a > 10 || b > 10){
            throw new Exception();
        } else {
            int result = a + b;
            return result;
        }
    }
}
