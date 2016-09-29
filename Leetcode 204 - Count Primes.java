Leetcode 204 - Count Primes.java

public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n + 1];
        int count = 0;
        
        for(int i = 2; i < n; i++) {
            if(notPrime[i] == true) {
                continue;
            }
            count++;
            
            for(int j = 2; i * j < n; j++) {
                notPrime[i * j] = true;
            }
        }
        return count;
    }
}