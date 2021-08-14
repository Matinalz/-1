package niuke;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-17 15:46
 */
public class NiZhi {
    public static char[] N(char[] a){
        int i = 0;
        int j = a.length-1;
        while (i<j){
            char tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
        return a;
    }
    public static String nizhi(String a,int n){
        char[] arr = a.toCharArray();
        char[] c = new char[arr.length];
        char[] d = new char[arr.length];
        int i = 0;
        while(arr.length<n){
            c[i] = arr[i];
            i++;
        }
        while (arr.length>i){
            d[i] = arr[i];
            i++;
        }
        char[] q = NiZhi.N(c);
        char[] w = NiZhi.N(c);
        NiZhi.N(d);
        String string = new String(q);
        String string1 = new String(w);
        String F = string + string1;
        char[] e = F.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.append(2));
        NiZhi.N(e);
        String string2 = new String(e);
        return string2;
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.append(2));
    }
}
