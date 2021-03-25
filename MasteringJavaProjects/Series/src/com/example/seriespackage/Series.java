package com.example.seriespackage;

public class Series {
    public static int nSum(int n){
        int total = 0;
        for(int i =0; i <= n; i++){
            total += i;
        }
        return total;
    }

    public static int factorial(int n){
        int total = 1;
        for(int i = 1; i <= n; i++){
            total *= i;
        }
        return total;
    }

    public static long fibonacci (int n){
        if(n == 0){
            return 0L;
        }
        if(n == 1){
            return 1L;
        }
        long fib = 0;
        long fibM1 = 1L;
        long fibM2 = 0L;
        for(int i = 0; i < n + 1; i++){
                fib = fibM1 + fibM2;
                fibM2 = fibM1;
                fibM1 = fib;
        }
        return fib;
    }

}
