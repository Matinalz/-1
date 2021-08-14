package Teat;

import com.sun.xml.internal.ws.util.xml.CDATA;

import java.util.ArrayList;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-06 10:13
 */
class ShunBiao{
    public int val;
    public ShunBiao next;
    public ShunBiao(){

    }
    public  ShunBiao(int x){
        this.val = x;
    }

}
public class TestDemo2 {
    public ShunBiao head;
    public void display(){
        ShunBiao cur = this.head;
        while(cur != null){
            System.out.println(cur.val+" ");
            cur = cur.next;
        }
    }
    public void touCha(int data){
        ShunBiao cur = new ShunBiao(data);
        if(this.head == null){
            this.head = cur;
        }
        else {
            cur.next = this.head;
            head = cur;
        }
    }
    public  void weiCha(int data) {
        ShunBiao nn = new ShunBiao(data);
        ShunBiao ds = this.head;
        if(this.head ==null){
            this.head = nn;
        }else {

            while (ds.next != null){
                    ds = ds.next ;
            }
            ds.next = nn;
        }
    }
    public int size(){
        ShunBiao s = this.head;
        int count = 0;
        while (s != null){
            s = s.next;
            count++;
        }
        return  count;
    }
    public void jieDian(){
        ShunBiao cur = this.head;
        if(cur == null){
            System.out.println("null");
        }
        else {
            while (cur.next != null){
                cur = cur.next;
                if(cur.val == cur.next.val){
                    ShunBiao prev = cur.next;
                    cur.next = prev.next;

                }
            }
        }
    }

    public static void main(String[] args) {
        TestDemo2 testDemo2 = new TestDemo2();
        testDemo2.touCha(1);
        testDemo2.weiCha(2);
        testDemo2.weiCha(3);
        testDemo2.weiCha(3);
        testDemo2.jieDian();
        testDemo2.display();
        System.out.println(testDemo2.size());
    }
}
class A extends TestDemo2{
    TestDemo2 testDemo2 = new TestDemo2();
}