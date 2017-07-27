package main;

import java.util.Scanner;

public class Anagrams {
    public static int numberNeeded(String first, String second) {
        int result = first.length() + second.length();
        char[] sec = second.toCharArray();
        for(int i = 0; i < first.length(); i++ ){
            if (second.contains(Character.toString(first.charAt(i)))){
                second = second.replace(first.charAt(i), '_');
                result -= 2;
                System.out.println(second);
            }
        }
        return result;
    }



    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        String b = in.next();
        String a = "bacdc";
        String b = "dcbadd";
        System.out.println(numberNeeded(a, b));
    }
}
