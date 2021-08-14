package niuke;

import java.util.Stack;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-11 10:10
 */
public class FirstNotRepeatingChar {
    public static int firstNotRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (j != i) {
                    if (str.charAt(i) == str.charAt(j)) break;
                    else {
                        if (j == str.length() - 1) return i;
                    }
                } else {
                    if (i == str.length() - 1) return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar.firstNotRepeatingChar("googoe"));
    }
}
