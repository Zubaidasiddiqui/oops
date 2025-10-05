package Line;
public class Main {
    public static void main(String[] args) {
        Point p1=new Point(3,9);
        System.out.println("Starting Points:"+p1);
        Point p2=new Point(3, 7);
        System.out.println("Ending Points:"+p2);
        Line l1=new Line(p1, p2);
        System.out.println("Original Line:"+l1);
        Line l2=new Line(l1);
        System.out.println("Copy of Line:"+l2);

    }    
}
