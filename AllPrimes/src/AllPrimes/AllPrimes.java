package AllPrimes;
import java.util.ArrayList;

public class AllPrimes {
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        }   else if (number < 2) {
            return false;
        }
    for (int i = 2; i < number; i++) {
        if (number % i == 0) {
            return false;
        }
    }
      return true;
}
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }
    public static void main(String[] args) {
        AllPrimes pr = new AllPrimes();
        System.out.println(pr.isPrime(2));

        int[] numbers = {6, 28, 33, 11, 13, 101, 43, 89};
        System.out.println(pr.onlyPrimes(numbers));
    }
}
