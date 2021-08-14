package operation;
import studentsystem.Book;
import studentsystem.bookList;
/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 15:42
 */
public class DisplayOperation implements IOperation{
    public void work(bookList booklist){
        System.out.println("显示书籍");
        for (int i = 0; i < booklist.getSize(); i++) {
            Book book = booklist.getBook(i);
            System.out.println(book);
            }
        }
}

