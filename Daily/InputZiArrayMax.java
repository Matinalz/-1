package Daily;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-12 15:50
 */
public class InputZiArrayMax {
    public static int val(int[] arr){
        if(arr == null || arr.length == 0) return -1;
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for(int i = 0; i < arr.length; i++){
            cur += arr[i];
            max = Math.max(cur, max);
            cur = cur < 0 ? 0 : cur;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] s = {1,-2,3,10,-4,7,2,-5,1,6};
        System.out.println(InputZiArrayMax.val(s));
        int d = Integer.MIN_VALUE;
    }
}
