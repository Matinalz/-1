package niuke;
import java.util.Arrays;
/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-15 15:47
 */
class N{
}
public class ArrayList_Test {
    private int[] elsm;
    private int next;
    private static final int length = 10;
    public ArrayList_Test(){
        this.elsm = new int[length];
        this.next = 0;
    }
    // 打印顺序表
    public void display() {
        System.out.print("[");
        for (int i = 0; i < next; i++) {
            if(i != next-1){
                System.out.print(elsm[i]+",");
            }else{
                System.out.print(elsm[i]);
            }
        }
        System.out.print("]");
        System.out.println();
    }
    // 在 pos 位置新增元素
    public boolean add(int pos, int data) {
        if(pos<0  || pos>elsm.length) return false;
        if(next >= elsm.length){
            elsm = Arrays.copyOf(elsm,2*elsm.length);
        }
        for (int i = next-1; i >= pos; i--) {
            elsm[i+1] = elsm[i];
        }
        elsm[pos] = data;
        next++;
        return true;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int x:elsm) {
            if(elsm[x] == toFind) return true;
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int x:elsm) {
            if(elsm[x] == toFind) return x;
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        for (int x:elsm) {
            if(x == pos) return elsm[x];
        }
       return -1;
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos<0 || pos>next){
            System.out.println("输入下标错误！");
        }
        else{
            for (int i = next-1; i >= pos; i--) {
                elsm[i+1] = elsm[i];
            }
            elsm[pos] = value;
            next++;
        }
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        for (int i = 0; i < next; i++) {
            if(elsm[i] == toRemove){
                for (int j = i; j <next; j++) {
                    elsm[j] = elsm[j+1];
                }
                next--;
                break;
            }
        }
    }
    // 获取顺序表长度
    public int size() {
        int count = 0;
        for (int i = 0; i < next; i++) {
            count++;
        }
        return count;
    }
    // 清空顺序表
    public void clear() {
        next = 0;
    }

    public static void main(String[] args) {
        ArrayList_Test listNode_ = new ArrayList_Test();
        listNode_.add(0,1);
        listNode_.add(1,2);
        listNode_.add(2,3);
        listNode_.setPos(3,5);
        listNode_.remove(1);
        System.out.println(listNode_.size());
        listNode_.display();
        System.out.println("=====================");
        listNode_.clear();
        listNode_.display();
    }

}
