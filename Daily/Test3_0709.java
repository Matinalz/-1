package Daily;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-09 16:26
 */
public class Test3_0709 {
    public static int intC(int x,int y){
        if(x/y == (x+0.0)/y){
            return x/y;
        }else {
            return x/y+1;
        }
    }
    public static void main(String[] args) {
        System.out.println(5*5-Test3_0709.intC(1,5));
    }
}
