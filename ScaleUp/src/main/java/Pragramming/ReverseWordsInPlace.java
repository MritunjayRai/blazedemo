//package Pragramming;
//
//public class ReverseWordsInPlace {
//    public static void main(String[] args) {
//        String input = "hello world";
//        String revered = reverseWord(input);
//        System.out.println("original word: "+ input);
//        System.out.println("reversed word: "+revered);
//    }
//
//    private static String reverseWord(String input) {
//        String[] words = input.split(" ");
//        StringBuilder reversed = new StringBuilder();
//        for(String word:words){
//            StringBuilder wordBuilder = new StringBuilder(word);
//            wordBuilder.reverse();
//            reversed.append(wordBuilder).append(" ");
//        }
//        return reversed.toString().trim();
//    }
//}