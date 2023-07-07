//package Pragramming;
//
//public class RemoveDuplicatesWithoutInBuiltMethod {
//    public static void main(String[] args) {
//        String input = "Hello worlds";
//        String result = removeDuplicates(input);
//        System.out.println("Original string: "+ input);
//        System.out.println("after removing duplicate characters: "+result);
//    }
//
//    private static String removeDuplicates(String input) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < input.length(); i++) {
//            char currentChar = input.charAt(i);
//            boolean isDuplicate = false;
//            //check if the character has already occurred in the result string
//            for (int j = 0; j < result.length(); j++) {
//                if (result.charAt(j) == currentChar) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            //if character is not duplicate, append it to the result  string
//            if (!isDuplicate) {
//                result.append(currentChar);
//            }
//        }
//        return result.toString();
//    }
//}