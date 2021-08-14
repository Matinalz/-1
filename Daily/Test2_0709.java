package Daily;

import java.util.Scanner;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-09 15:39
 */
public class Test2_0709{
    public static String d(int[] arr,int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) return i+"";
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == x) return "("+i+","+j+")";
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,7,7,8};
        System.out.println(Test2_0709.d(array, scanner.nextInt()));


    }
}
