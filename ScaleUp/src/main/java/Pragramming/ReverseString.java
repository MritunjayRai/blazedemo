package Pragramming;

public class ReverseString {
    public static void main(String[] args) {
        String input= " hello java world";
        String reverseString = reverseString(input);
        System.out.println("reverse string: "+ reverseString);
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}