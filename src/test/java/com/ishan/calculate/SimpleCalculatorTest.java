package com.ishan.calculate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    private SimpleCalculator simpleCalculator;

    @BeforeEach
    public void InitSimpleCalculator(){
        simpleCalculator = new SimpleCalculator();
    }

    @Test
    public void TestEmptyString(){
        int actualResult = simpleCalculator.Add("");
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult, "Empty string for Add method return 0");
    }
}
