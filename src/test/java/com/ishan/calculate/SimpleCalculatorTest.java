package com.ishan.calculate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    private SimpleCalculator simpleCalculator;

    @BeforeEach
    public void initSimpleCalculator(){
        simpleCalculator = new SimpleCalculator();
    }

    @Test
    public void testEmptyString(){
        int actualResult = simpleCalculator.Add("");
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult, "Empty string for Add method will return 0");
    }

    @Test
    public void testStringWithTwoNumbers(){
        int actualResult = simpleCalculator.Add("1,2");
        int expectedResult = 3;
        assertEquals(expectedResult,actualResult, "String 1,2 for Add method will return 3");
    }
}
