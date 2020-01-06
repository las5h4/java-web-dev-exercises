package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Enter a term to search for:");
        String term = input.nextLine();
        Boolean answer = sentence.toLowerCase().contains(term.toLowerCase());
        Integer index = sentence.indexOf(term);
        Integer length = term.length();
        String newSentence = sentence.substring(0, index) + sentence.substring(index + length, 301);
        System.out.println(answer);
        System.out.println("index: " + index);
        System.out.println("length: " + length);
        System.out.println("Sentence without the searched term: " + newSentence);
    }
}
