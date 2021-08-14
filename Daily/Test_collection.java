package Daily;

import java.util.*;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-12 10:20
 */
public class Test_collection {
    public static int Array_val(int[] a){
        Arrays.sort(a);
        int count = 1;
        for (int i = 0,j = 1; i <=j && j<a.length; i++,j++) {
            if(a[i] == a[j]){
                count++;
                if(count > a.length/2){
                    return a[i];
                }
            }else {
                count = 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] s = {1,2,3,2,2,2,5,4,2};
        System.out.println(Test_collection.Array_val(s));
    }
}
