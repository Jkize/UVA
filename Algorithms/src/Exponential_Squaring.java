/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhoan Saavedra
 */
public class Exponential_Squaring {
    
    public static void main(String[] args) {
        int a=3;
        int b=10;
        System.out.println(power_iter(a, b));
        System.out.println(power(a, b)); 
        System.out.println(power(a, b, 1000));
        System.out.println(power_iter(a, b, 1000));
       
    }
    
    
    
    // Método Recursivo
    public static int power(final int a, final int N) {
        if (N == 0) {
            return 1;
        } else {
            final int R = power(a, N / 2);
            if (N % 2 == 0) {
                return R * R;
            } else {
                return R * R * a;
            }
        }
    }

    public static long power(final int a, final int N, int M) {
        if (N == 0) {
            return 1;
        } else {
            final long R = power(a, N / 2, M);
            if (N % 2 == 0) {
                return (R * R) % M;
            } else {
                return (R * R * a) % M;
            }
        }
    }
    
    public static int power_iter(int a, int n){
        int result=1;
        while(n>0){
            if(n%2!=0){
                result*=a;
                n-=1;
            }else{
                a*=a;
                n/=2;
            }
        }
        return result; 
    }
    
    public static long power_iter(int a, int n, int M){
         int result=1;
        while(n>0){
            if(n%2!=0){
                result=(result*a)%M;
                n-=1;
            }else{
                a=(a*a)%M;
                n/=2;
            }
        }
        return result; 
    }
    
}
