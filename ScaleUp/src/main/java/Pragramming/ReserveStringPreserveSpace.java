//package Pragramming;
//
//public class ReserveStringPreserveSpace {
//    public static void main(String[] args) {
//        String input = "Mritunjay Rai";
//        reverse(input);
//    }
//    static void reverse(String str){
//        char[] inputArray =str.toCharArray();
//        char[] result = new char[inputArray.length];
//        for (int i = 0, j = inputArray.length-1 ; i < inputArray.length; i++) {
//            if(inputArray[i] == ' '){
//                result[i]=' '; //preserve space
//            }else{
//                if(inputArray[j]==' '){
//                    j--; //skip space
//                }
//                result[j]=inputArray[i];
//                j--;
//            }
//        }
//        System.out.println(String.valueOf(result));
//    }
//
//}
