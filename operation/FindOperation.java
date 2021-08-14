package operation;
import studentsystem.Book;
import studentsystem.bookList;

import java.util.Scanner;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 15:40
 */
public class FindOperation implements IOperation{
    public void work(bookList booklist){
        System.out.println("查找书籍");
        System.out.println("请输入要查找书籍名字");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < booklist.getSize(); i++) {
            Book book = booklist.getBook(i);
            if(scanner.nextLine().equals(book.getName())){
                System.out.println(" 找到此书！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
