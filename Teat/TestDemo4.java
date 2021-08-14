package Teat;
class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class TestDemo4 extends X{
    Y y=new Y();
    public TestDemo4(){
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new TestDemo4();
    }
}