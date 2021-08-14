package Daily;

import java.util.Arrays;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-10 15:20
 */
public class Test3_0710 {
    public static void minValue(int[] x,int k){
        for (int i = 0; i < x.length-1; i++) {
            for (int j = 0; j < x.length-i-1; j++) {
                if(x[j]>x[j+1]){
                    int s = x[j+1];
                    x[j+1] = x[j];
                    x[j] = s;
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            if(i<k) System.out.print(x[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,2,2,2,5,4,2};
        Test3_0710.minValue(a, 3);
    }
}
