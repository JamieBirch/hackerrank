package com.github.jamie_birch;

import java.util.Scanner;

public class FibArray {
    public static long fibonacci(int n) {
        long[] a = new long[n + 1];

        a[0] = 0;
        a[1] = 1;

        for (int i = 2; i <= n; i++){
            a[i] = a[i-1] + a[i-2];
        }

        return a[n];

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
