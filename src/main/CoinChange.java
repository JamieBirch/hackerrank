package main;


import java.util.Scanner;

public class CoinChange {

    public static long change(int dollars, int[] coins) {

        if (dollars == 0) { return 1; }
        if (coins.length == 0) { return 0; }

        long[] store = new long[dollars+1];
        store[0] = 1;

        for (int coin : coins) {
            for (int i = 0; i < store.length-coin; i++) {
                store[i+coin] += store[i];
            }
        }
        return store[dollars];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(change(n, coins));
    }
}
