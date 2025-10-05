package Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("------TRIANGLE------");
        Triangle t1=new Triangle();//default
        System.out.println("Null Triangle:"+t1);
        Triangle t2=new Triangle(6);//equilateral
        System.out.println("Equilateral Triangle:"+t2);
        Triangle copy2=new Triangle(t2);//copy
        System.out.println("Copy of t2:"+copy2);
        Triangle t3=new Triangle(3, 8);//isoceles
        System.out.println("Isoceles Triangle:"+t3);
        Triangle copy3=new Triangle(t3);//copy
        System.out.println("Copy of t3:"+copy3);
        Triangle t4=new Triangle(5, 2, 7);//scalene
        System.out.println("Scalene Triangle:"+t4);
        Triangle copy4=new Triangle(t4);//copy
        System.out.println("Copy of t4:"+copy4);
        


    }
}
