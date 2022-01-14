//package exercises.Lecture2;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class PracticeArrayList {
//    public static void main(String [] args) {
//
//        Scanner input = new Scanner(System.in);
//        ArrayList<Integer> nums = new ArrayList<Integer>(
//        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        System.out.println(sumEven(nums));
//    }
//
//    ArrayList<String> words = new ArrayList<>(Arrays.asList("Peach", "Cherry", "Banana", "Mango", "Pineapple", "Grapefruit"));
//            System.out.println("What is the length of the word you have chosen?");
//            int wordLength = input.nextInt();
//            System.out.println(fiveLetters, wordLength);
//    );
//    public static int sumEven(ArrayList<Integer> arr){
//        int total = 0;
//        for( int i : arr){
//            if (i % 2 == 0){
//                total += i;
//            }
//        }
//        return total;
//    }
//    public static void fiveLetters(ArrayList<String> arr, int length){
//        for(String word : arr){
//            if(word.length() == length) {
//                System.out.println(word);
//            }
//        }
//    }
//}
