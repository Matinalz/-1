package niuke;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-16 15:44
 */
class E{
    public int val;
    public E next;
    public E(int val) {
        this.val = val;
    }
    public E(){

    }
}
public class LinkedList {
    public E head;
    //头插法
    public void addFirst(int data){
       E node = new E(data);
       node.next = this.head;
       this.head = node;
    }

    //尾插法
    public void addLast(int data){
        E node = new E(data);
       if(head == null){
           this.head = node;
       }else{
           E cur = this.head;
           while (cur.next != null){
               cur = cur.next;
           }
           cur.next = node;
       }

    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if(index > size()){
            return false;
        }
        E node = new E(data);
        E cur = head;
        int count = 0;
        while (cur.next != null && count<index){
            cur = cur.next;
            count++;
        }
        node.next = cur.next;
        cur.next = node;
        return false;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        if(head == null) return false;
        E node =this.head;
        while (node != null){
            if(node.val == key){
                return true;
            }
            node = node.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
       if(this.head.val == key){
           this.head = this.head.next;
           return;
       }
       E pre = Epre(key);
       if(pre == null){
           System.out.println("找不到你要删除的节点");
           return;
       }
       E del = pre.next;
       pre.next = del.next;
    }
    //要删除的前驱节点
    public E Epre(int key){
        E pre = this.head;
        while (pre.next != null){
            if(pre.next.val == key){
                return pre;
            }
            pre = pre.next;
        }
        return null;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        E pre = this.head;
        E cur = this.head.next;
        while (cur != null) {
            if(cur.val == key){
                pre.next = cur.next;
                cur = cur.next;
            }else{
                pre = cur;
                cur = cur.next;
            }
        }
        if(this.head.val == key){
            this.head = this.head.next;
        }
    }

    //得到单链表的长度
    public int size(){
        if(head == null) return 0;
        E node = head;
        int count = 0;
        while (node != null){
            node = node.next;
            count++;
        }
        return count;
    }
    public void display(){
        E cur = this.head;
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    public void clear(){
//        E node = this.head;
        if(head == null) return;
        while (head.next != null){
            this.head = this.head.next;
        }
        this.head = this.head.next;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(1);
        linkedList.addFirst(1);
        linkedList.addFirst(1);
        linkedList.addLast(4);
        linkedList.addIndex(5,9);
        linkedList.display();
        System.out.println("=======================================");
        linkedList.clear();
        linkedList.display();
    }
}
