//package Pragramming;
//
//public class FindSecondLargestNumber {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 9, 3, 4, 5, 11};
//        int secondLargestNumber = findSecondLargestNumber(numbers);
//        System.out.println("second largest number: " + secondLargestNumber);
//
//    }
//
//    private static int findSecondLargestNumber(int[] numbers) {
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > largest) {
//                secondLargest = largest;
//                largest = numbers[i];
//            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
//                secondLargest = numbers[i];
//            }
//
//        }
//        return secondLargest;
//    }
//}
