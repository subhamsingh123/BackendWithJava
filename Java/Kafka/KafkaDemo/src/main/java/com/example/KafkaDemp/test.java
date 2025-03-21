package com.example.KafkaDemp;

import java.util.Arrays;
import java.util.stream.Collectors;

class test {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        int[] n = {1 ,2 ,3 ,3 ,4, 5 };
    }

    public static int majorityElement(int[] nums) {
        Arrays.stream(nums).collect(Collectors.groupingBy(x->x),Collectors.maximumofthegroup);
        return 0;
    }
}