package ra.demo3;

public class Circle {
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
        return 2*3.14*this.r;
    }

    // phương tính chu vi hình tròn
}
