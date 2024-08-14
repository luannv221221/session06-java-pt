package ra.demo3;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Dien tich hinh tron = "+circle.getS());
        System.out.println("Chu vi hinh tron = "+circle.getCV());
        Cylinder cylinder = new Cylinder(10,20);

        System.out.println("Theer tich hinh tru = "+cylinder.getV());
    }
}
