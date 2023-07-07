//package Pragramming;
//
//// Java program to reverse a string
//// preserving spaces.
//public class ReverseStringPreserveSpace {
//    // driver function
//    public static void main(String[] args) {
//        reverse("Mritunjay Rai");
//    }
//    // Function to reverse the string
//    // and preserve the space position
//    static void reverse(String str) {
//        char[] inputArray = str.toCharArray();
//        char[] result = new char[inputArray.length];
//
//        // Traverse input string from beginning
//        // and put characters in result array
//        // in reverse order, skipping spaces
//        for (int i = 0, j = inputArray.length - 1; i < inputArray.length; i++) {
//            if (inputArray[i] == ' ') {
//                result[i] = ' '; // Preserve spaces
//            } else {
//                if (inputArray[j] == ' ') {
//                    j--; // Skip spaces in reverse
//                }
//                result[j] = inputArray[i];
//                j--;
//            }
//        }
//        System.out.println(String.valueOf(result));
//    }
//
//}
