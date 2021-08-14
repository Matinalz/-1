package niuke;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-16 20:27
 */
public class ArrayYuanSuChuXianCiShu {
    public int GetNumberOfK(int [] array , int k) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k){
                tmp++;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,3};
        ArrayYuanSuChuXianCiShu arrayYuanSuChuXianCiShu = new ArrayYuanSuChuXianCiShu();
        System.out.println(arrayYuanSuChuXianCiShu.GetNumberOfK(a, 3));
    }
}
