package Day10;

public class ArmstrongNumbers {

    // Helper method to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        String numStr = String.valueOf(n);
        int numberOfDigits = numStr.length();
        long sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10; 
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong Numbers between 1 and 10,000 are:");

        for (int i = 1; i <= 10000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For a newline at the end
    }
}