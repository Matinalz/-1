package niuke;

/**
 * @program:IntelliJ IDEA
 * @Description
 *      //判断一个字符串是回文结构的实现过程
 * @Author:Matinal
 * @Date:2021-07-11 11:01
 */
public class Judge {
    public static boolean judge (String str) {
        for (int i = 0; i < str.length(); i++) {
            if(i+1<str.length()){
                if(str.charAt(i) == str.charAt(i+1)){
                    if(i+1 == str.length()-1){
                        return true;
                    }
                }else return false;
            }
        }
        for (int i = 0; i <= str.length()/2; i++) {
            int mid=str.length()/2;
            if(str.charAt(mid-i) == str.charAt(mid+i)){
                if(mid-i == 0 && mid+i == str.length()-1){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(Judge.judge("ababb"));
    }
}
