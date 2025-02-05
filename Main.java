public class Main {
    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number, sum = 0, digits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            digits++;
        }
        originalNumber = number;
        while (originalNumber != 0) {
            int remainder = originalNumber % 10;
            sum += Math.pow(remainder, digits);
            originalNumber /= 10;
        }
        return sum == number;
    }
}
