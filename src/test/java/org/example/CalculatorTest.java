package org.example;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    //assertTrue: 조건이 참이면 성공, 거짓이면 에러 메시지
    //assertFalse: 조건이 거짓이면 성공, 참이면 에러 메시지
    public void testAddTrue() throws Exception{
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int expectedValue = 15;

        assertTrue(actualValue == expectedValue);
    }
    public void testAddFalse() throws Exception{
        Calculator calc = new Calculator();
        int actualValue = calc.add(5, 10);
        int expectedValue = 24;

        assertTrue(actualValue != expectedValue);
    }

    public void testAddException() throws Exception{
        Calculator calc = new Calculator();
        try{
            int result = calc.add(15, 20);
            assertFalse(false);
        } catch (Exception ex){
            assertTrue(true);
        }
    }
}