package operation;
import studentsystem.Book;
import studentsystem.bookList;

import java.util.Scanner;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 15:30
 */
public class AddOperation implements IOperation{
    public void work(bookList booklist){

        System.out.println("请输入书籍名字！");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入作者名字！");
        String author = scanner.nextLine();
        System.out.println("请输入书籍类型！");
        String type = scanner.nextLine();
        System.out.println("请输入书籍价格！");
        int price = scanner.nextInt();

        for (int i = 0; i < booklist.getSize(); i++) {
            Book book = booklist.getBook(i);
            if(name.equals(book.getName())){
                System.out.println("有此书存在，不用重复添加！");
                return;
            }
        }
        Book book = new Book(name,author,price,type);
        booklist.setBook(booklist.getSize(),book);
        booklist.setSize(booklist.getSize()+1);
        System.out.println("添加成功！");
    }
}
