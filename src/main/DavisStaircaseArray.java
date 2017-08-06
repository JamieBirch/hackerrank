package com.github.jamie_birch;

import java.util.Scanner;

public class DavisStaircaseArray {

    public static int combos(int n){
        int[] a = new int[n];

        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;

        a[0] = 1;
        a[1] = 2;
        a[2] = 4;

        for(int i = 3; i < n; i++){
            a[i] = a[i-1] + a[i-2] + a[i-3];
        }

        return a[n - 1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(combos(n));
        }
    }
}
