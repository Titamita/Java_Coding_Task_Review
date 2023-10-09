package week3;

public class Kateryna_Prime_Number {

    public static void main(String[] args) {

        primeNumber(13);

    }

    public static void primeNumber(int number){

        if (number==2 || number==3 || number==5 || number==7){
            System.out.println(number + " is Prime");
        } else if (!(number%2==0 || number%3==0 || number%5==0 || number%7==0)){
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is NOT prime");
        }

    }

}
/*
Numbers -- Prime Number
Write a method that can check if a number is prime or not
 */