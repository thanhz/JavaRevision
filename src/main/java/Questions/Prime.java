package Questions;

public class Prime {
    public static void main(String[] args) {
        System.out.println(Math.log10(9));
        System.out.println(Math.log10(3));
        System.out.println((Math.log10(9)/Math.log10(3)) % 1 == 0);
    }

    public int countPrimes(int n) { //(n log log n)
        boolean[] primes = new boolean[n];
        int counter = 0;
        for(int i = 2; i < primes.length; i++){
            if(isPrime(i)){
                counter++;
            }
        }
        return counter;
    }

    public boolean isPrime(int num) {
        if (num <= 1) return false;
        // Loop's ending condition is i * i <= num instead of i <= sqrt(num)
        // to avoid repeatedly calling an expensive function sqrt().
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public boolean isPowerOfThree(int n) {
        if (n == 0)
            return false;

        if (n == 1)
            return true;

        if (n > 1)
            return n % 3 == 0 && isPowerOfThree(n / 3);
        else
            return false;
    }
}
