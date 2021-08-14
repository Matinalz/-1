package Daily;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-23 11:44
 */
public class Sort {
    //时间复杂度：O(N^2)
    //稳定性：不稳定
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1+i; j < array.length; j++) {
                if(array[j] < array[i]){
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] d = {1,33,2,55,44,3};
        Sort.selectSort(d);
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]+" ");
        }
    }
}
