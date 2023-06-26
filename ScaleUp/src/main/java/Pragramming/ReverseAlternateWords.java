package Pragramming;

public class ReverseAlternateWords {
    public static void main(String[] args) {
        String input = "Maersk Global Service Center";
        String output = reverseWords(input);
        System.out.println(output);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseString(word);
            result.append(reversedWord).append(" ");
        }

        return result.toString().trim();
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right++;
        }

        return new String(chars);
    }
}
