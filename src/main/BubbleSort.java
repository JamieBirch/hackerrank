package main;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];

        for( int i = 0; i < n; i++ ){
            a[i] = in.nextInt();
        }

        int numberOfSwaps = 0;

        for( int i = 0; i < n; i++){

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.printf("Array is sorted in %d swaps.\n", numberOfSwaps);
        System.out.printf("First Element: %d\n", a[0]);
        System.out.printf("Last Element: %d\n", a[n-1]);

    }
}
