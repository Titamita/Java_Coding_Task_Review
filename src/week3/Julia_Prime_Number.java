

package week3;
Create Kate_Prime_Number.java

public class Julia_Prime_Number {

    public static void main(String[] args) {

        System.out.println(primeNumber(11));

    }

    public static boolean primeNumber(int n){

        if(n <= 1){ // prime numbers are integers greater than 1
            return false;
        }

        for (int i = 2; i < n; i++){

            if(n % i == 0){
                return false;
            }
        }
        return true;

    }
}
