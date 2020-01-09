package exercises;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayListPractice {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        findEvenNumSum(arr);
        Scanner input = new Scanner(System.in);
        System.out.println("Word length:");
        Integer term = input.nextInt();
        System.out.println(searchWordsByLength(createWordList(removePunctuation(sentence)), term));
    }
    public static void findEvenNumSum(ArrayList<Integer> anyArray){
        Integer evenNumSum = 0;
        for (int number : anyArray){
            if (number % 2 == 0){
                evenNumSum = evenNumSum + number;
                continue;
            }
        }
        System.out.println(evenNumSum);
    }
    public static String removePunctuation(String anyString){
        String[] punctuationMarks = {",", "?", "!"};

        if (anyString.contains(".") == true) {
            String newString = "";
            String[] splitString = anyString.split("\\.");
            for (int i = 0; i < splitString.length; i++) {
                newString = newString.concat(splitString[i]);
            }
            anyString = newString;
            if (anyString.contains(",") == true) {
                newString = "";
                String[] splitString2 = anyString.split(",");
                for (int i = 0; i < splitString2.length; i++) {
                    newString = newString.concat(splitString2[i]);
                }
                anyString = newString;
                if (anyString.contains("!") == true) {
                    newString = "";
                    String[] splitString3 = anyString.split("!");
                    for (int i = 0; i < splitString3.length; i++) {
                        newString = newString.concat(splitString3[i]);
                    }
                    anyString = newString;
                    if (anyString.contains("?") == true) {
                        newString = "";
                        String[] splitString4 = anyString.split("\\?");
                        for (int i = 0; i < splitString4.length; i++) {
                            newString = newString.concat(splitString4[i]);
                        }
                        anyString = newString;
                    }
                }
            }
        }
        return anyString;
    }
    public static List<String> createWordList(String anyString){
        String words[] = anyString.split(" ");
        List<String> wordsList = Arrays.asList(words);
        return wordsList;
    }
    public static String searchWordsByLength(List<String> anyArray, Integer term){
        String results = "";
        for (String word : anyArray){
            if (word.length() == term){
                results = results.concat(word);
                results = results.concat(", ");
                continue;
            }

        }
        if (results == ""){
            results = "No results.  ";
        }
        String finalResults = results.substring(0, results.length() - 2);
        return finalResults;
    }
}
