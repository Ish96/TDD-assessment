package com.ishan.calculate;

import java.util.Arrays;

public class SimpleCalculator {

    public int Add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        String s[] = numbers.split("[,\n]");
        int sum = Arrays.stream(s).mapToInt(Integer::parseInt).sum();
        return sum;
    }
}
