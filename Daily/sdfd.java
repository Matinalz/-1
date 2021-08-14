package Daily;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-28 10:58
 */
public class sdfd {
    public static void lastStoneWeight(int[] stones) {
        for(int i = 0;i<stones.length-1;i++){
            for(int j = 0; j<stones.length-1-i;j++){
                if(stones[j]<stones[j+1]){
                    int tmp = stones[j];
                    stones[j] = stones[j+1];
                    stones[j+1] = tmp;
                }
            }
        }
    }
    public static void shiftDown(int[] array, int size, int index) {
        int left = 2*index + 1;
        while(left<size){
            int min = left;
            int right = 2*index + 2;
            if(right<size){
                if(array[right]<array[left]){
                    min = array[right];
                }
            }
            if(array[index]<=array[min]){
                int tmp = array[index];
                array[index] = array[min];
                array[min] = tmp;
                index = min;
                left = 2*index +1;
            }
        }
    }
    public static void main(String[] args) {
       int[] f = {7,6,7,6,9};
        sdfd.lastStoneWeight(f);
        System.out.println(Arrays.toString(f));

    }
}
