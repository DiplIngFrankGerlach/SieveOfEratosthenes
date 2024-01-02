// Java program to print all primes smaller than or equal to 
// n using Sieve of Eratosthenes 
  
class SieveOfEratosthenes { 
    void sieveOfEratosthenes(int n) 
    { 
        // Create a boolean array "prime[0..n]" and 
        // initialize all entries it as true. A value in 
        // prime[i] will finally be false if i is Not a 
        // prime, else true. 
        boolean prime[] = new boolean[n + 1]; 
        for (int i = 0; i <= n; i++) 
            prime[i] = true; 
  
        for (int p = 2; p * p <= n; p++) { 
            // If prime[p] is not changed, then it is a 
            // prime 
            if (prime[p] == true) { 
                // Update all multiples of p greater than or 
                // equal to the square of it numbers which 
                // are multiple of p and are less than p^2 
                // are already been marked. 
                for (int i = p * p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
  
        // Print all prime numbers 
        for (int i = 2; i <= n; i++) { 
            if (prime[i] == true) 
                System.out.print(i + " "); 
        } 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        System.out.println("Running the sieve 10 times to eliminate the Java VM startup+JIT runtimes");
        for(int i=0; i < 10; i++)
        {
           int n = 10000000; 
           System.out.print("Following are the prime numbers "); 
           System.out.println("smaller than or equal to " + n); 
           SieveOfEratosthenes g = new SieveOfEratosthenes(); 
           g.sieveOfEratosthenes(n); 
        }
    } 
} 
  
// This code is contributed by Aditya Kumar (adityakumar129)
