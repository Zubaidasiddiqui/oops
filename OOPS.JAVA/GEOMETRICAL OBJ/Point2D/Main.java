package Shallowdeep;

public class Main {
    public static void main(String[] args) {
        //null
        Point2d p1=new Point2d();
        System.out.println("p1:"+p1);
        //paramaterized
        Point2d p2=new Point2d(4,8);
        System.out.println("p2:"+p2);
        //deep copy
        Point2d p3=new Point2d(p2);
        System.out.println("p3:"+p3);
        //shallow copy
        Point2d p4=p2;
        System.out.println("p4:"+p4);
        //set
        p2.setX(56);
        p4.setY(76);
        System.out.println("p2:"+p2);
        System.out.println("p3:"+p3);
        System.out.println("p4:"+p4);
    }
}
