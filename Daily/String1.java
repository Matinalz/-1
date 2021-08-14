package Daily;

import java.util.*;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-11 13:26
 */
class To{
    public void to(String x,String y){
        if(x.compareTo(y)>0){
            System.out.println(y+">"+x);
        }else if(x.compareTo(y) == 0){
            System.out.println(y+"="+x);
        }else {
            System.out.println(y+"<"+x);
        }
    }
}
public class String1 {
    public static void main(String[] args) {
        String q= "adw";
        char[] w = {'a','d','w'};
        String f = new String(w);
        System.out.println(q.substring(1));
        char[] s = q.toCharArray();
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
        System.out.println(q.concat(f));//连接
        System.out.println(q.contains("as"));
        String[] r=q.split(" ");
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
        new To().to(q.intern(),f);
    }

    public static void main1(String[] args) {
        char[] a = {'1', '2', '4', '5'};
        String s = new String(a);
        char sum = ' ';
        String d = "12345";
        new To().to(s, d);
    }
}
