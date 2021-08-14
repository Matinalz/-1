package Daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-14 15:36
 */
class A_{
    public void nizi(String s){
        int i = s.split(" ").length-1;
        while (i>=0){
            System.out.print(s.split(" ")[i]+" ");
            i--;
        }
    }
    //x为要分隔的字符串，y为分隔符

    //x为字符串，y为要查询的字符
    public int size(String x,char y){
        char[] d = x.toCharArray();
        int count = 0;
        for (int i = 0; i < d.length; i++) {
            if(d[i] == y){
                count++;
            }
        }
        return count;
    }
}
public class NiZhiString {
    public static void main(String[] args) {
        String string= "I am a student";
        A_ a = new A_();
        a.nizi(string);
        char[] f = string.toCharArray();
        System.out.println(Arrays.toString(f));
    }
}
