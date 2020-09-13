package Questions;
//The Fibonacci sequence is a set of numbers that starts with a one or a zero, followed by a one,
// and proceeds based on the rule that each number (called a Fibonacci number) is equal to the sum of the preceding two numbers
public class Fibonacci {

    private static void FibonacciIterative(int number){
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        int n3;
        for (int i = 1; i < number; i++) { //int i = 2 if we don't want to start from 0th fibonacci
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
        //return n3;
    }

    private static int FibonacciRecursive(int number){ //This O(2 to power of N)
        if(number == 0 | number == 1){
            return number;
        } else {
            return FibonacciRecursive(number-1 ) + FibonacciRecursive(number-2);
        }
    }

    //Dynamic Programming
    Integer[] memoized = new Integer[0];
    private static int FibonacciRecursiveMem(int number, Integer[] memoized){ //This O(n)
        int result;
        if(memoized[number] != null){
            return memoized[number];
        }
        if(number == 0 | number == 1){
            result =number;
        } else {
            result = FibonacciRecursiveMem(number-1, memoized) + FibonacciRecursiveMem(number-2,memoized);
            memoized[number] = result;
        }
        return result;
    }

    public static void main(String[] args) {
        FibonacciIterative(10);
        System.out.println(FibonacciRecursive(10));
    }
}
