package user;
import operation.*;
import java.util.Scanner;
/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 15:17
 */
public class NormalUser extends User{
    public NormalUser(String name){
        super(name);
        this.operations = new IOperation[]{
            new ExitOperation(),
            new FindOperation(),
            new BorrowOperation(),
            new ReturnOperation()
        };
    }

    public int menu(){
        System.out.println("=============================");
        System.out.println("欢迎"+ this.name +"来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("=============================");
        System.out.println("请输入您的选择");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
