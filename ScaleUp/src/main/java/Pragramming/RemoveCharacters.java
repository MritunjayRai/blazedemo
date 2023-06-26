package Pragramming;

public class RemoveCharacters {
    public static void main(String[] args) {
        String str1 = "Maersk Global Service Center";
        String str2 = "esr";
        String result = removeCharacters(str1, str2);
        System.out.println(result);  // Output: Mak Global vice Cnt
    }

    public static String removeCharacters(String input, String charactersToRemove) {
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (charactersToRemove.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}