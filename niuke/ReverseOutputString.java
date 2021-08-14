package niuke;

import stringtest.S;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-16 13:55
 */
public class ReverseOutputString {
    public String solve (String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length/2; i++) {
            char tmp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = tmp;
        }
        String string1 = new String(arr);
        return string1;
    }

    public static void main(String[] args) {
        String string1 = "abcdqwe";
        ReverseOutputString reverseOutputString = new ReverseOutputString();
        System.out.println(reverseOutputString.solve(string1));
    }
}
