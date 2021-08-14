package user;

import operation.*;

import java.util.Scanner;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 15:17
 */
public class AdminUser extends User{
    public AdminUser(String name){
        super(name);
        this.operations = new IOperation[]{
           new ExitOperation(),
           new FindOperation(),
           new AddOperation(),
           new DelOperation(),
           new DisplayOperation()
        };
    }
    public int menu(){
        System.out.println("===================================");
        System.out.println("欢迎"+ this.name +"来到图书管理系统");
        System.out.println("1.查找书籍");
        System.out.println("2.添加书籍");
        System.out.println("3.删除书籍");
        System.out.println("4.展示书籍");
        System.out.println("0.退出系统");
        System.out.println("===================================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
