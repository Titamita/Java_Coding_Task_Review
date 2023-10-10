package week3;

public class Kate_Prime_Number {

    public static void main(String[] args) {

        System.out.println(isPrime(7));
        System.out.println(isPrime(6)); // divisible by 1,2,3,6
        System.out.println(isPrime(8));
        System.out.println(isPrime(5));
    }
    public static boolean isPrime(int n){

        if(n<2){ //numbers less than 2 are not prime
            return false;
        }
        for(int i=2; i<n; i++){ //start from 2 bc prime n is evenly divisible by 1

            if(n % i == 0 ){
                return false; //not prime (evenly divisible by other than 1 or itself)
            }
        }
        return  true; //assume it is prime
    }


}
/*
1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not

  prime: evenly divided by 1 and itself only
 */
