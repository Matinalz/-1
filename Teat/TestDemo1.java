package Teat;

import java.util.Arrays;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-05 19:05
 */
class Biao{
    public void jiOuShu(int[] w){
        int left = 0;
        int right = w.length-1;
        int tem = 0;
        while (left<right){
            while (w[left]%2 ==0 && left<right){
                left++;
            }
            while (w[right]%2 !=0 && left<right){
                right--;
            }
            int t = w[left];
            w[left] = w[right];
            w[right] = t;
        }
        System.out.println(Arrays.toString(w));
    }
}
public class TestDemo1{
    public static void main(String[] args) {
        int[] arr = {1,35,7,3,4,6,10};
        Biao biao = new Biao();
        biao.jiOuShu(arr);
    }
}
