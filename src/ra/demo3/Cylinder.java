package ra.demo3;

public class Cylinder extends Circle {
    private double h;

    public Cylinder() {
    }

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getV(){
        return  super.getS()*this.h;
    }
}
