package studentsystem;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-13 14:20
 */
public class bookList {

    private Book[] books = new Book[10];
    private int usedsize = 0;
    public  bookList(){
        books[0] = new Book("三国演义","罗贯中",23,"小说");
        books[1] = new Book("水浒传","施耐庵",33,"小说");
        books[2] = new Book("西游记","吴承恩",55,"小说");
        books[3] = new Book("红楼梦","曹雪芹",15,"小说");
        usedsize = 4;
    }
    public Book getBook(int pos) {
        return books[pos];
    }
    public void setBook(int pos, Book book) {
        books[pos] = book;
    }
    public int getSize() {
        return usedsize;
    }
    public void setSize(int usedsize) {
        this.usedsize = usedsize;
    }

}
