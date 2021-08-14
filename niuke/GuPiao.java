package niuke;

import static java.lang.Integer.MIN_VALUE;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-13 14:53
 */
public class GuPiao {
    public int maxProfit (int[] prices) {
        int x = MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<prices.length;i++){
            if(i+1<prices.length){
                sum += prices[i+1]-prices[i];
                x = Math.max(x,sum);
                 sum = sum>0?x:0;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] s = {1,2,4};
        GuPiao guPiao = new GuPiao();
        System.out.println(guPiao.maxProfit(s));
    }
}
