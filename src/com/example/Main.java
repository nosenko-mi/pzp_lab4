package com.example;

import java.util.ArrayList;
import java.util.BitSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int limit = 288000;
        int n = 20;
        n = FileController.loadData("input.txt");
        ArrayList<Integer> primes = AtkinSieve.getPrimesUpTo(limit);
//        primes.forEach(System.out::println);
        String primesString = PrimesFormatter.getPrimesTo4Power(primes, n);
        System.out.println(primesString);
        System.out.format("position: %d; character: %c\n", n, primesString.charAt(n-1));
        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.format("Used MB of memory: %d", usedBytes/1048576);
        FileController.saveData("output.txt", primesString.charAt(n-1));
    }
}
