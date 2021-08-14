import studentsystem.bookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 16:26
 */
public class Main {
    public static User login(){
        System.out.println("请输入您的姓名:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入您的身份: 1 表示管理员, 0 表示普通用户");
        int who = scanner.nextInt();
        if (who == 1){
            return new AdminUser(name);
        }
        return new NormalUser(name);
    }
    public static void main(String[] args) {
        bookList booklist = new bookList();
        User user = login();
        while (true) {
            int choice = user.menu();
            user.doOperation(choice, booklist);
        }
    }
}
