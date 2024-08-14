package ra.demo3;

public class Circle {
    public static final double PI = 3.14;
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getS(){
        return 2*PI*this.r;
    }

    // phương tính chu vi hình tròn
    public double getCV(){
        return  2 *PI* 3.14;
    }
}
