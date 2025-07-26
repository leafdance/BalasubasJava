package ca.belenzo;

public class PrimeCheck2 {

    public static void main(String[] args) {
        int num = 27;
        boolean flag = false;

        for (int i = 2; i <= num / 2; ++i) {
            System.out.println("i is " + i);
            System.out.println("num / 2 is " + (num/2));
            if (num % i == 0) {
                flag = true;
                System.out.println("flag is now true");
                break;
            }
        }

        if (!flag) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is Not Prime Number");
        }
    }
}
