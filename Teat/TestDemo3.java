package Teat;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-09 16:23
 */
class List{
    public int data;
    public List next;

    public List(){

    }
    public List(int data){
        this.data = data;
    }

}

public class TestDemo3 {
    public List head;
    public void addFrist(int data){
        List node = new List(data);

            node.next = this.head;
            this.head = node;

    }
    public void display(){
        List de = this.head;
        while (de != null) {
            System.out.println(de.data);
            de = de.next;
        }
    }
    public List FindFrist(List a,List b){
        while (a != null && b != null){
            while (b != null){
                if(a.data != b.data){
                    b=b.next;
                }else {
                    return a;
                }
            }
            a = a.next;
        }
        return a;
    }
}
