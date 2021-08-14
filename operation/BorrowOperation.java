package operation;
import studentsystem.Book;
import studentsystem.bookList;

import java.util.Scanner;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 15:44
 */
public class BorrowOperation implements IOperation{
    public void work(bookList booklist){
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你就要借阅的图书名字");
        String name = scanner.nextLine();

        for (int i = 0; i < booklist.getSize(); i++) {
            Book book = booklist.getBook(i);
            if(name.equals(book.getName())){
                book.setIs(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("借阅失败，可能没有此书或者已经借出！");
    }
}
