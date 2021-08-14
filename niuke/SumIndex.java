package niuke;

import java.util.Arrays;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-11 17:30
 */
public class SumIndex {
    public int[] twoSum (int[] numbers, int target) {
        int[] dex = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(target-numbers[i] == numbers[j]){
                    if(i <= j){
                        dex[0] = i+1;
                        dex[1] = j+1;
                        break;
                    }
                }
            }
        }
        return dex;
    }

    public static void main(String[] args) {
        int[] d = {0,4,3,0};
        int[] t =new SumIndex().twoSum(d,0);
        System.out.println(Arrays.toString(t));
    }
}
