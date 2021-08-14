package niuke;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-16 13:40
 */
public class ArrayYuanSuMax {
    public int maxsumofSubarray (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >0){
                sum +=arr[i];
                return sum;
            }
        }
        return -1;
    }
}
