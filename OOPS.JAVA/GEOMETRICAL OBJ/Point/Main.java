package Point;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ///null
       Point p1=new Point(0,0);
       System.out.println("Null Point:"+p1);
       //para
       Point A=new Point(2,5);
       Point B=new Point(3, 9);
       System.out.println("First Point:"+A);
       System.out.println("Second Point:"+B);
       //copy
       Point p2=new Point(A);
       System.out.println("Copy of A:"+p2);
       Point p3=new Point(B); 
       System.out.println("Copy of B:"+p3);
       //compare to
       float output=A.compareTo(B);
        if(output<0){
            System.out.println(A+"is less than"+B);
        }else if(output>0){
            System.out.println(A+"is greater than"+B);
        }else{
            System.out.println(A+"is equal to"+B);
        }
       //clone
       Point clone=(Point)A.clone();
       System.out.println("Clone of A:"+clone);
       Point cloned=(Point)B.clone();
       System.out.println("Clone of B:"+cloned);
    }
}
