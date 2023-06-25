//package Pragramming;
//
//public class RemoveDuplicateChar {
//    public static void main(String[] args) {
//        String str = "Hello World";
//        String result = removeDuplicates(str);
//        System.out.println("original string: "+ str );
//        System.out.println("string after removing the duplicates: "+ result);
//    }
//
//    private static String removeDuplicates(String str) {
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<str.length();i++){
//          char ch = str.charAt(i);
//          if(sb.indexOf(String.valueOf(ch))==-1){
//              sb.append(ch);
//          }
//        }
//        return sb.toString();
//    }
//}