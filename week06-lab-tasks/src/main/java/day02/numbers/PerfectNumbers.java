package day02.numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int sumOfDivisors = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return number == sumOfDivisors;
    }
}
