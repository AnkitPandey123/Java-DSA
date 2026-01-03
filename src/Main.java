
import recursion.*;
import seiveoferatosenes.*;

import java.util.ArrayList;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        // recursion.Factorial called
        System.out.println(Factorial.fact(5));

        // recursion.Fibonacci called
        System.out.println(Fibonacci.fib(9));

        // seriveofeatosenes.PrimeNumber1ToN called

        ArrayList<Integer> primes = PrimeNumbers1ToN.findPrimeFrom1ToN(20);
        for(int i : primes)
        {
            System.out.println(i);
        }


    }
}