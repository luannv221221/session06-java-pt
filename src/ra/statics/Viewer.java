package ra.statics;

public class Viewer {
    private static int countView;

    public void visitedWeb(){
        countView++;
    }
    public void display(){
        System.out.println("Demo");
    }
    public static int getCountView() {

        return countView;
    }
}
