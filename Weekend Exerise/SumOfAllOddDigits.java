public class SumOfAllOddDigits {
    public static void main(String[] args) {

        int sum = 0;

        int[] digits = {2, 3, 4, 5, 6, 7, 98, 45, 100};

        for (int number = 0; number < digits.length; number++) {
            if (digits[number] % 2 != 0)
            sum += digits[number];
        }

        System.out.println("Sum: " + sum);

    }
}


