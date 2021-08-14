package Daily;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-10 16:38
 */
public class Test2_0710 {
    public static void index_Value(int[] z){
        for (int i = 0; i < z.length-1; i++) {
            for (int j = 0; j < z.length-i-1; j++) {
                if(z[j]>z[j+1]){
                    int s = z[j+1];
                    z[j+1] = z[j];
                    z[j] = s;
                }
            }
        }
        int sum = 1;
        for (int i = 0; i < z.length-1; i++) {
            if(z[i] == z[i+1]){
                sum++;
            }else {
                sum = 1;
            }
            if(sum>z.length/2){
                System.out.println(z[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,2,2,2,2,2};
        Test2_0710.index_Value(arr);
    }
}
