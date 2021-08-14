package user;

import operation.IOperation;
import studentsystem.bookList;
/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 15:18
 */
abstract public class User {
    protected String name;
    protected IOperation[] operations;
    public User(String name) {
        this.name = name;
    }
    abstract public int menu();
    public void doOperation(int choice,bookList booklist){
        operations[choice].work(booklist);
    }
}
