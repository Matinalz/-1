package niuke;

import java.util.Arrays;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-16 20:40
 */
public class ArrayJuShuPre {
    public int[] reOrderArray (int[] array) {
        int[] arr1 = new int[array.length];
        int index = 0;
        for (int x:array) {
            if(x%2 != 0){
                arr1[index] = x;
                index++;
            }
        }
        for (int x:array) {
            if(x%2 == 0){
                arr1[index] = x;
                index++;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] a = {1,23,4,3,5};
        ArrayJuShuPre arrayJuShuPre = new ArrayJuShuPre();
        System.out.println(Arrays.toString(arrayJuShuPre.reOrderArray(a)));
    }
}
