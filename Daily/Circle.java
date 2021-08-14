package Daily;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-06-24 10:30
 */
class Circles{
    private double Radius;
    public Circles(double R){
        this.Radius = R;
    }
    public double getArea(){
        return 2*3.14*this.Radius;
    }

    public double getRadius() {
        return Radius;
    }
}
class Cylinder extends Circles{
    private double hight;

    public double getHight() {
        return hight;
    }

    public Cylinder(double w, double hight){
        super(w);
        this.hight = hight;
    }
    public double v(){
        return super.getArea()*hight;
    }
}
public class Circle {
    public static void main(String[] args) {
        Cylinder v = new Cylinder(2,3);
        System.out.println(v.getRadius());
        System.out.println(v.getHight());
        System.out.println(v.v());
    }
}
