//package org.launchcode.java.;

//import org.launchcode.java.studioCountingCharacters;
//
//import java.util.Scanner;
//import java.util.HashMap;
//import java.util.Map;

//public class CountingCharacters {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a word or phrase: ");
//        String myString = input.nextLine();
//
//        Hashmap<Character, Integer> characterCounts = new Hashmap<>();
//        char[] charactersInString = myString.toCharArray();
//        for (int i =0; i< charactersInString.length; i++){
//            for(Character character : charactersInString){
//
//            if(characterCounts.containsKey(character)){
//                Integer characterValue = characterCounts.get(character) +1;
//                characterCounts.put(character, characterValue);
//
//            }else{
//
//            }
//            System.out.println(charactersInString[i]);
//        }
//    }
//}
