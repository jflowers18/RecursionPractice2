import java.util.Scanner;

public class Main {

    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci Number?");
        int n = input.nextInt();


        System.out.println(fib(n));
    }
}