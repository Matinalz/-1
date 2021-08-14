package operation;
import studentsystem.Book;
import studentsystem.bookList;

import java.util.Scanner;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 15:38
 */
public class DelOperation implements IOperation{
    public void work(bookList booklist){
        System.out.println("删除图书！");
        System.out.println("请输入要删除图书的名字！");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int index = -1;
        for (int i = 0; i < booklist.getSize(); i++) {
            Book book = booklist.getBook(i);
            if(name.equals(book.getName())){
                index = i;

            }

        }
        if(index == -1){
        System.out.println("未找到要删除图书的名字！");
        }
        for (int i = index; i < booklist.getSize()-1; i++) {
            Book book = booklist.getBook(i+1);
            booklist.setBook(i,book);
        }
        booklist.setBook(booklist.getSize()-1,null);
        booklist.setSize(booklist.getSize()-1);
    }
}
