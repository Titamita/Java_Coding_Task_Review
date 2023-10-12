package week3;

public class Julia_Prime_Number_JD {

    public static void main(String[] args) {

        System.out.println(isPrime(11));

    }

    public static boolean isPrime(int number){

        if(number <= 1){
            return false;
        }

        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
                /*
                Inside the loop, it checks whether number is divisible by i without any remainder. It does this by using the modulo operator %. If number % i equals 0, it means that number is divisible by i, and therefore, it's not a prime number
                 */
            }
        }
        return true;
    }
}
