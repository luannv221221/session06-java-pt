package ra.demo01;

public class Student extends Human{
    private String studentCode;

    public Student() {
    }

    public Student(String name, boolean sex, int age, String studentCode) {
        super(name, sex, age);
        this.studentCode = studentCode;
    }

    public void learn(){
        System.out.println(super.getName() +"Ma SV"+this.studentCode+"Đang học bai");
    }
}
