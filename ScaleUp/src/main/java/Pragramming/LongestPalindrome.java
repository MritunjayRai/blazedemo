package Pragramming;

public class LongestPalindrome {
    public static void main(String[] args) {
        String input = "babad";
        String longestPalindrome = findLongestPalindrome(input);
        System.out.println(longestPalindrome);  // Output: bab
    }

    public static String findLongestPalindrome(String input) {
        if (input == null || input.length() < 2) {
            return input;
        }

        String longestPalindrome = "";

        for (int i = 0; i < input.length(); i++) {
            String oddPalindrome = expandAroundCenter(input, i, i);
            String evenPalindrome = expandAroundCenter(input, i, i + 1);

            String currentLongest = oddPalindrome.length() > evenPalindrome.length() ? oddPalindrome : evenPalindrome;

            if (currentLongest.length() > longestPalindrome.length()) {
                longestPalindrome = currentLongest;
            }
        }

        return longestPalindrome;
    }

    private static String expandAroundCenter(String input, int left, int right) {
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }

        return input.substring(left + 1, right);
    }
}