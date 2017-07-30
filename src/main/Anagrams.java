package main;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static int numberNeeded(String first, String second) {

        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);

        int result = firstChars.length + secondChars.length;
        int second_i = 0;
        for(int i = 0; i < firstChars.length; i++ ){
            for(int j = second_i; j < secondChars.length; j++){
                if (firstChars[i] == secondChars[j]){
                    second_i += 1;
                    secondChars[j] = ' ';
                    result -= 2;
                    break;
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
