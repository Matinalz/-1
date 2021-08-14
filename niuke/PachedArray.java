package niuke;

import java.util.Arrays;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-16 13:09
 */
public class PachedArray {
    public void merge(int A[], int m, int B[], int n) {
        for (int i = m; i < B.length; i++) {
            A[m] = B[i-m];
        }
        Arrays.sort(A);
    }
}
