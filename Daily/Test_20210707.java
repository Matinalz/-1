package Daily;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-07 11:27
 */
class Array{
    public boolean search(int[][] arr,int x){
        boolean flg = false;
        for (int i = 0; i < arr.length; i++) {
            int mid = arr[i].length/2;
            if(arr[i][mid] <= x){
                mid = mid + 1;
                for (int j = mid; j <arr[i].length; j++) {
                    if(arr[i][mid] == x) flg = true;
                }
            }else {
                mid = mid -1;
                for (int j = mid; j >= 0; j--) {
                    if(arr[i][j] == x) flg = true;
                }
            }
        }
        return flg;
    }
}
public class Test_20210707 {
    public static void main(String[] args) {
        int [][]array = {
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };
        Array sa = new Array();
        System.out.println(sa.search(array, 15));
    }
}
