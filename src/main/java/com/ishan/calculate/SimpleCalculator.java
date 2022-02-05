package com.ishan.calculate;

import java.util.Arrays;

public class SimpleCalculator {

    public int Add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        String delimiter = ",";
        String remain = numbers.trim();
        if(numbers.startsWith("//")){
            delimiter = remain.substring(2,3);
            remain = remain.substring(4);
        }
        String s[] = remain.split("["+delimiter+"\n]");
        int sum = Arrays.stream(s).mapToInt(Integer::parseInt).sum();
        return sum;
    }
}