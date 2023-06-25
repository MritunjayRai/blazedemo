package Pragramming;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        boolean areAnagram = areAangram(str1, str2);
        if (areAnagram) {
            System.out.println(str1 + " and " + str2 + " are Anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams");
        }
    }

    private static boolean areAangram(String str1, String str2) {
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }

}