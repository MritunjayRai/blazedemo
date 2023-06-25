//package Pragramming;
//
//import java.util.HashMap;
//
//public class CountDuplicateWords {
//    public static void main(String[] args) {
//        String sentence = "Java program java Program and Java Program";
//        String[] words=sentence.toLowerCase().split(" ");
//        HashMap<String, Integer> wordCountMap= new HashMap<>();
//        for(String word: words){
//            if(wordCountMap.containsKey(word)){
//                wordCountMap.put(word,wordCountMap.get(word)+1);
//            }else{
//                wordCountMap.put(word,1);
//            }
//        }
//        for(String word:wordCountMap.keySet()){
//            int count =wordCountMap.get(word);
//            if(count>1){
//                System.out.println("word: "+word+", count: "+count);
//            }else{
//                System.out.println("word: "+word+", count: "+count);
//            }
//        }
//    }
//}