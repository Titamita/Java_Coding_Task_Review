package src.week3;

public class ElenaPrimerNumberOrNot {

    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % 2 ==0 || n % 3 ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
}
