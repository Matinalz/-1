package niuke;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-17 11:49
 */
class DoubleList{
    public int val;
    public DoubleList(int val) {
        this.val = val;
    }
    public DoubleList() {

    }
    public DoubleList pre;
    public DoubleList next;

}
public class DoubleLinkedList {
    public DoubleList head;
    public DoubleList last;

    //头插法
    public void addFirst(int data){
        DoubleList node = new DoubleList(data);
        if(head == null) {
            head = node;
            last = node;
        }

        node.next = this.head;
        this.head.pre = node;
        head = node;
    }


    //尾插法
    public void addLast(int data){
        DoubleList node = new DoubleList(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else{
            last.next = node;
            node.pre = last;
            last = node;
        }
    }


    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        DoubleList cur = new DoubleList(data);
        DoubleList node = this.head;
        if(index == 0){
            cur.next = head;
            head.pre = cur;
            head = cur;
            return true;
        }
        if(index == size()){
            cur.next = last;
            last.pre.next = cur;
            last.pre = cur;
            return true;
        }
        int count = 1;
        if(size() < index || index < 0) return false;
        while (node.next != null && count < index){
            count++;
            node = node.next;
        }
        cur.next = node.next;
        node.next.pre = cur;
        node.next = cur;
        cur.pre = node;
        return true;
    }


    //查找是否包含关键字key是否在链表当中
    public boolean contains(int key){
        DoubleList node = this.head;
        if(this.head == null) return false;
        while(node != null){
            if(node.val == key){
                return true;
            }else {
                node = node.next;
            }
        }
        return false;
    }


    //删除第一次出现关键字为key的节点
    public void remove(int key){
        DoubleList node = this.head;
        if(this.head == null) return;
        while(node != null){
            if(node.val == key){
                //删除节点是头节点
               if(node == this.head){
                   this.head = this.head.next;
                   this.head.pre = null;
               }else{
                   //删除节点是中间节点
                   node.pre.next = node.next;
                   if(node.next != null){
                       node.next.pre = node.pre;
                   }else{
                       //删除尾巴节点
                       last = node.pre;
                   }
               }
               return;
            }else {
                node = node.next;
            }
        }
    }


    //删除所有值为key的节点
    public void removeAllKey(int key){
        DoubleList node = this.head;
        while (node != null){
            if(node.val == key){
                //node节点为要删除的节点
                if(node == this.head){
                    this.head = this.head.next;
                    //假设全部是要删除的数字
                    if (this.head != null){
                        this.head.pre = null;
                    }else{
                        last = null; //防止链表的节点不能被回收
                    }
                }else{
                    //删除节点要么在中间，要是尾巴节点
                    node.pre.next = node.next;
                    if(node.next != null){
                        node.next.pre = node.pre;
                    }else {
                        //删除尾巴节点
                        last = node.pre;

                    }
                }
                node = node.next;
            }else {
                node = node.next;
            }
        }
    }


    //得到单链表的长度
    public int size(){
        DoubleList node = this.head;
        int count = 0;
        while (node != null){
            count++;
            node = node.next;
        }
        return count;
    }
    public void display(){
        DoubleList node = this.head;
        if (node == null) return;
        while (node != null){
            System.out.print(node.val+" ");
            node = node.next;
        }
        System.out.println();
    }
    public void clear(){
        while (this.head != null){
            this.head = this.head.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addLast(11);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addLast(23);
        System.out.println(list.contains(1));
        list.display();
        System.out.println("======================================");
//        list.removeAllKey(1);
        list.clear();
        list.display();
    }
}
