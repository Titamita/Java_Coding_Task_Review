package src.week3;

public class dan_primeNumber {
    public static void main(String[] args) {

        System.out.println(primeNumber(19));

    }

    public static boolean primeNumber(int n){

        if(n < 2){ // prime numbers are integers greater than 1
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
