package com.ishan.calculate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        String s[] = remain.split("[\n"+delimiter+"]");
        List<Integer> nums = Arrays.stream(s).map(s2 -> {
            try {
                return Integer.parseInt(s2);
            } catch (Exception e) {
                throw new RuntimeException("Input is NOT ok");
            }
        }).collect(Collectors.toList());
        List<Integer> negativeNums = nums.stream().filter(n1 -> n1 < 0).collect(Collectors.toList());
        if(!negativeNums.isEmpty()){
            String exceptionMsg = negativeNums.stream().map(String::valueOf).collect(Collectors.joining(","));
            throw new RuntimeException("negatives not allowed "+ exceptionMsg);
        }
        int sum = nums.stream().reduce(0, (a,b) -> a+b);
        return sum;
    }
}