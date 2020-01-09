package org.launchcode.java.charactercounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args){
        printMap(countCharacters(askForSentence()));
    }
    public static String askForSentence(){
        String sentence = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Type a sentence:");
        sentence = input.nextLine();
        return sentence;
    }
    public static HashMap<Character, Integer> countCharacters(String phrase){
        HashMap<Character, Integer> countMap = new HashMap<>();
        char[] phraseChars = phrase.toCharArray();
        for (char phraseChar : phraseChars){
            if (countMap.containsKey(phraseChar)){
                int curVal = countMap.get(phraseChar);
                curVal = curVal + 1;
                countMap.put(phraseChar, curVal);
            } else {
                countMap.put(phraseChar, 1);
            }
        }
        return countMap;
    }
    public static void printMap(HashMap<Character, Integer> countMap){
        for (Map.Entry<Character, Integer> count : countMap.entrySet()){
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}
