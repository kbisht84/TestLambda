package com.company.kbisht;

import java.util.stream.Stream;

public class TestLoops {

    public static void main(String args[]) {
        int k = 0;
        int n = 100;

        System.out.println(compute(k, n));
    }
        //infinite Stream
    public static int compute(int k, int n) {
        return Stream.iterate(k, e -> e + 1)
                .filter(e -> e % 2 == 0)
                .filter(e -> Math.sqrt(e) > 20)
                .mapToInt(e -> e * 2)
                .limit(n)
                .sum();

    }

}
