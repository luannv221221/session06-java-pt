package ra.demo2;

public class Dog extends Animal{
    private String name;
    private String color;

    public Dog() {
    }

    public Dog(String type, int weight, String name, String color) {
        super(type, weight);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void voice(){
        System.out.println("Tên : "+this.name+" Lông màu "+this.color+" Loài "+super.getType());
    }
}
