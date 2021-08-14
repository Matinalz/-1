package Daily;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-17 18:59
 */
public class Test {
    public static void getCustomerInfo() throws FileNotFoundException, IOException {
        try {

            // do something that may cause an Exception

        } catch (java.lang.Exception ex) {

            System.out.print("Exception!");

        }
    }

    public static void main(String[] args) {
        try {
            getCustomerInfo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
