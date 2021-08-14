package niuke;

import java.util.Scanner;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-16 20:10
 */
public class Sqrt {
    public double sqrt (double x) {
        if(x == 0){
            return 0;
        }
        double a = Math.pow(x,0.5);
        return a;
    }

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println(sqrt.sqrt(scanner.nextInt()));
        }
    }
}
