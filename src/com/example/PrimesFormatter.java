package com.example;

import java.util.ArrayList;

public class PrimesFormatter {
    private PrimesFormatter(){
    }

    public static String getPrimesTo4Power(ArrayList<Integer> primes, Integer position){
        StringBuilder result = new StringBuilder();
        int tmp;
        int i = 0;
//        for (Integer number: primes){
//            tmp = (int) Math.pow(number, 4);
//            result.append(String.format("%d", tmp));
//        }
        while (result.length() < position){

            tmp = (int) Math.pow(primes.get(i), 4);
            result.append(String.format("%d", tmp));
            i++;
        }
        return result.toString();
    }
}
