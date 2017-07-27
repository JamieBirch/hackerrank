package main;


import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int result[] = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            int r_i = ( a_i - k < 0 ? n + a_i - k : a_i - k );
            result[r_i] = a[a_i];
        }

        for(int r_i=0; r_i < n; r_i++){
            System.out.print(result[r_i] + " ");
        }
    }
}
