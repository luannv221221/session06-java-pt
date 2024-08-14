package ra.demo2;

public class Animal {
    private String type;
    private int weight;

    public Animal() {
    }

    public Animal(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void display(){
        System.out.println("Loài "+this.type);
        System.out.println("Cân nặng "+this.weight);
    }
}
