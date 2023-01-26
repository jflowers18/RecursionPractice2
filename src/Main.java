import java.util.Scanner;
//work please
public class Main {
    public static void main(String[] args) {
        System.out.println("In Recursion Main");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter F for Fibonnacci or L for Factorial");
        String s = input.nextLine();

        //if the input is the letter F then get a number from the user
        //and fun the fib function
        //if the input is the letter L then get a number from the user
        //and fun the factorial function
        if(s.matches("F")) {
            System.out.println("Fibonacci Number?");
            long n = input.nextLong();
            System.out.println(fib(n));
        } else if (s.matches("L")) {
            System.out.println("Factorial Number?");
            long n = input.nextLong();
            System.out.println(factorial(n));
        }
    }

    public static long fib(long n) {
        if (n == 0 || n == 1)
            return n;
        else {
            return fib(n - 1) + fib(n - 2);
            //System.out.println(l);
            //return l;
        }
    }
    public static long factorial(long n) {
        //factorial of 0 and 1 are both 1
        if (n <= 1)
            return 1;
        else {
            //multiply the current value of n times the factorial of the current number minus one
            return n * factorial(n -1 );
        }
    }

}