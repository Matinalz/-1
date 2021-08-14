package Daily;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-24 09:30
 */
public class Shape {
    public static void main(String[] args) {
        char[][] arr = new char[4][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ' ';
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i == 0 || i == arr.length-1){
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = '*';
                }
            }else {
                arr[i][0] = '*';
                arr[i][arr[i].length-1] = '*';
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
