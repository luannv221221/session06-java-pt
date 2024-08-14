package ra.statics;

public class Test {
    public static void main(String[] args) {
        Viewer v1 = new Viewer();
        v1.visitedWeb();
        Viewer v2 = new Viewer();
        v2.visitedWeb();
        Viewer v3 = new Viewer();
        v3.visitedWeb();
        v3.visitedWeb();
        System.out.println(Viewer.getCountView());
    }
}
