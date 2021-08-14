package Daily;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-14 14:11
 */
class Array_fanzhuan{
    public String fan(char[] s,int k){
        String string = new String(s);
        return substring(s,k,string.length())+substring(s,0,k);
    }
    public String substring(char[] w,int x,int y){
        char[] d = new char[y-x];
        int j = 0;
        for (int i = 0; i < w.length; i++) {
            if(x <= i && i < y){
                d[j]= w[i];
                j++;
            }
        }
        String string = new String(d);
        return string;
    }
}
public class Test_0714 {
    public static void main(String[] args) {
        String d = "abcdef";
        char[] arr = d.toCharArray();
        Array_fanzhuan a = new Array_fanzhuan();
        System.out.println(a.fan(arr,2));
    }
}
