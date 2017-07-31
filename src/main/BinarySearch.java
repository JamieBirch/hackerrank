package main;

import java.util.Arrays;
import java.util.Scanner;

class IceCream implements Comparable<IceCream>{
    int price;
    int id;

    public IceCream(int price, int id) {
        this.price = price;
        this.id = id;
    }

    @Override
    public int compareTo(IceCream other) {
        if(this.price > other.price){
            return 1;
        } else if(this.price < other.price){
            return -1;
        } else return this.id - other.id;
    }


    public boolean equals(IceCream other){
        return (this.id == other.id && this.price == other.price);
    }

}

public class BinarySearch {
    public static int binarySearch(int first, int last, IceCream[] arr, int search) {
        if(first <= last){
            int n = last - first;
            int m = first + n/2;

            if(arr[m].price == search){
                return arr[m].id;
            }

            if(arr[m].price > search){
                return binarySearch(first, m - 1, arr, search );
            }

            return binarySearch(m + 1, last, arr, search);
        }

        return -1;

    }

    public static void main(String[] args) {

        int t;
        int n, m;

        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for(int test = 0; test < t; test++) {

            m = in.nextInt();
            n = in.nextInt();
            IceCream[] arr = new IceCream[n];

            for (int i = 0; i < n; i++)
                arr[i] = new IceCream(in.nextInt(), i + 1);

            Arrays.sort(arr);
            int firstIndex = 100000, secondIndex = 100000;
            for(int i = 0; i < n - 1 ; i++) {
                int search = m - arr[i].price;
                if(search >= arr[i].price) {
                    int index = binarySearch( i + 1, n - 1, arr, search);
                    if( index != -1 ) {
                        System.out.println( Math.min(arr[i].id, index) + " " + Math.max(arr[i].id, index));
                        break;

                    }
                }
            }

        }

    }

}
