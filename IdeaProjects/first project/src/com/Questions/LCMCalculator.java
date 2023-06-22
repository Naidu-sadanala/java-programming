package com.Questions;

public class LCMCalculator {
        // Function to calculate GCD (Greatest Common Divisor)
        private static int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        // Function to calculate LCM (Least Common Multiple) of two numbers
        private static int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }

        // Function to calculate LCM of an array of numbers
        public static int lcmOfArray(int[] numbers) {
            int result = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                result = lcm(result, numbers[i]);
            }
            return result;
        }

        public static void main(String[] args) {
            // Example usage
            int[] numbers = { 2, 4, 8, 10};
            int lcmResult = lcmOfArray(numbers);
            System.out.println("LCM: " + lcmResult);
        }

}
