package src.week9;

import java.util.Arrays;

public class concat2Arrays {
    public static void main(String[] args) {
        int [] a ={1,2,3,4};
        int [] b ={5,6,7,8};

        System.out.println(Arrays.toString(concatArrays(a,b)));


    }
    public static int [] concatArrays (int [] a, int [] b){
        int index =0;
        int [] out = new int[a.length+ b.length];
        for(int i=0;i<out.length;i++){
            if(i<a.length){
                out[i]=a[i];
            }else {
                out[i]= b[index];
                index++;
            }
        }
        return out;
    }
}
