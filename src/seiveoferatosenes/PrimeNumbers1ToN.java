package seiveoferatosenes;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers1ToN {

    public static ArrayList<Integer> findPrimeFrom1ToN(int n)
    {
        int num = n + 1;
        Boolean[] isPrime = new Boolean[num];
        Arrays.fill(isPrime, true);
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=2;i*i<=n;i++)
        {
            if(isPrime[i] == true)
            {
                for(int j=i*i;j<=n;j=j+i)
                {
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2;i<=n;i++)
        {
            if(isPrime[i] == true)
            {
                primes.add(i);
            }
        }

        return primes;
    }
}
