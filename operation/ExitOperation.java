package operation;
import studentsystem.bookList;
/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 15:46
 */
public class ExitOperation implements IOperation{
    public void work(bookList booklist){
        System.out.println("退出系统");
        System.exit(1);
    }
}
