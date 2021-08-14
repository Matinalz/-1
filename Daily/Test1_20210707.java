package Daily;

import java.util.Arrays;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-07 15:25
 */
public class Test1_20210707 {
    public static boolean dd(int x){
        int[] arr = new int[1000];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = i+1;

            //当第一瓶药为毒药时需要的小白鼠最少
            if(arr[0] == 1) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //该药是第几瓶药
        int y = 1;
        System.out.println(Test1_20210707.dd(y));
    }
}
