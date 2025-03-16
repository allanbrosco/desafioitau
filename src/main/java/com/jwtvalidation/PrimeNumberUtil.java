package com.jwtvalidation;

public class PrimeNumberUtil {
    public static boolean isPrime(long number) {
        if (number <= 1) return false;
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
