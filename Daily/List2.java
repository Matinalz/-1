package Daily;

import com.sun.org.apache.bcel.internal.classfile.Constant;
import sun.security.pkcs11.wrapper.Constants;

import java.util.ArrayList;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-21 21:01
 */
class list {
    private int i;

}
public class List2 {
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        String str = "abcd ef!";
        String str1 = "ab";
        char[] arr1 = str1.toCharArray();
        char[] arr =str.toCharArray();
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != arr1[j]){
                    arrayList.add(arr[i]);
                    return;
                }
            }
        }
        System.out.println(arrayList);
    }
}
