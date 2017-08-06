package com.github.jamie_birch;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class RansomHashtable {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public RansomHashtable(String magazine, String note) {
        magazineMap = new Hashtable<>();
        noteMap = new Hashtable<>();

        for(String word : magazine.split(" ")){

            Integer i = magazineMap.get(word);

            if(i == null){
                magazineMap.put(word, 1);
            } else {
                magazineMap.put(word, i + 1);
            }
        }

        for(String word : note.split(" ")){

            Integer i = noteMap.get(word);

            if(i == null){
                noteMap.put(word, 1);
            } else {
                noteMap.put(word, i + 1);
            }
        }
    }

    public boolean solve() {
        for(Map.Entry<String, Integer> entry : noteMap.entrySet()){
            Integer i = magazineMap.get(entry.getKey());

            if (i == null || i < entry.getValue()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        RansomHashtable s = new RansomHashtable(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
