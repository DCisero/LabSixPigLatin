package com.company;
import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String userInput = "";
        String vowelLetters = "'a', 'e', 'i', 'o', 'u'";
        String conLetters = "";
        String latin = "";
        String upper = userInput.toUpperCase();
        //String lower = userInput.toLowerCase();

        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.println();


        //prompt the user to input a word
        upper = userInput.toLowerCase(); //convert word to lowercase if upper case
        System.out.print("Enter a word to be translated: ");
        userInput = scan.nextLine();
        userInput = userInput.trim();
        System.out.println();

        //if char v begins with a vowel, add "way" to the end
        char vowel = userInput.charAt(0); //at first index [0]
        int vowels = vowelLetters.indexOf(vowel);


        if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
            System.out.println(upper + userInput.toLowerCase() + "way");

            //if word starts with a consonant, move letters to the end + add -ay
        } else {
            for (int i = 0; i < userInput.length(); i++) {
                char t = userInput.charAt(i);
                if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') {
                    String wordChange = userInput.substring(i);
                    String prefix = userInput.substring(0, i);
                    System.out.println("Your word translated: " + wordChange + prefix + "ay");
                    break;
                }
            }
        }


    }
}
















