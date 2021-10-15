package homework.chapter5;

public class FindPrime {
    public static void main(String[] args) {
        boolean isprime;
        int num = 14;
        if (num < 2) {
            isprime = false;
        } else isprime = true;
        for (int i = 2; i <= num; i++) {
            if ((num % i) == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println("Prime");
        } else
            System.out.println("Not Prime");
    }
}
