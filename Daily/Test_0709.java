package Daily;

import java.util.Scanner;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-09 14:06
 */
public class Test_0709 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int x = scanner.nextInt();
            int z = x;
            int y = 0;
            for (int i = 0; i < 32; i++) {
                y += x&1;
                x = x>>>1;
            }
            System.out.println(z+"共有二进制1的个数为"+y+"个");
        }
    }
}
