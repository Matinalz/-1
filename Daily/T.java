package Daily;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-18 18:20
 */
 class A<T> {

    T value;
    A(T value) {
        this.value = value;
    }
    T get() {
        return value;
    }

    @Override
    public String toString() {
        return "value= " + value;
    }
}
public class T {
    public static void main(String[] args) {
        A<String> a = new A<>("asd");
        System.out.println(a);
    }
}
