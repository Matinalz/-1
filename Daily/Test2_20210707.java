package Daily;

import java.util.Arrays;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-07 16:02
 */
public class Test2_20210707 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] arr = new int[9];
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 != 0){
                arr[arr.length-c-1] = array[i];
                c++;
            }
        }
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0){
                arr[x] = array[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
