//package Pragramming;
//
//import java.util.regex.Pattern;
//
//public class PasswordValidator {
//    public static void main(String[] args) {
//        String password = "P@ssw0rd12";
//        boolean isValid = validatePassword(password);
//        System.out.println("if the password " +"||" +password+ "||"+ " is valid or not: "+isValid); // Output: true
//    }
//
//    public static boolean validatePassword(String password) {
//        String pattern = "^(?=.*[!@#$%^&*()])(?=.*[a-zA-Z].*[a-zA-Z])(?=.*[0-9].*[0-9]).{10}$";
//        return Pattern.matches(pattern, password);
//    }
//}