package niuke;

import java.util.Arrays;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-14 21:52
 */
public class BinarySearch {

    public int jumpFloor(int target) {
        if(target <= 2){
            if(target == 1){
                return 1;
            }else {
                return 2;
            }
        }

        return jumpFloor(target-1)+jumpFloor(target-2);
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.jumpFloor(12));
    }
}
