package ca.belenzo;

public class PrimeCheck1 {

    public static boolean isPrime(int number) {
        if (number <= 1) return false; // 0 and 1 are not prime

        for (int i = 2; i < number; i++) {
            System.out.println("number is " + number + ", i is " + i);
            if (number % i == 0) {
                System.out.println("Return FALSE --> " + number + " % " + i +" is zero!");
                return false; // found a divisor other than 1 and itself
            }
        }

        return true; // no divisors found
    }

    public static void main(String[] args) {
        int num = 29;

        if (isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}
