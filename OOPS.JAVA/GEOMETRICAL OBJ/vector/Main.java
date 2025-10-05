public class Main{
    public static void main(String[] args) {
        Vectornd v1=new Vectornd(1.0,4.0,7.0);
        System.out.println("V1:"+v1);
        Vectornd v2=new Vectornd(2.0,8.0,5.0);
        System.out.println("V2:"+v2);
        //magnitude
        System.out.println("Magnitude of V1:"+v1.magnitude());
        System.out.println("Magnitude of V2:"+v2.magnitude());
        //sum
        System.out.println("Addition of V1 And V2:"+v1.add(v2));
        //difference
        System.out.println("Subtraction of V1 And V2:"+v1.subtract(v2));
        //dot product
        System.out.println("Dot product of V1 And V2:"+v1.dotproduct(v2));
        //cross product
        System.out.println("Cross product of V1 And V2:"+v1.crossproduct(v2));
        //clone
        System.out.println("Clone of V1:"+v1.clone());
        System.out.println("Clone of V2:"+v2.clone());
        //equal
        System.out.println("V1 equals V2:"+v1.equal(v2));
        System.out.println("Clone of V1 equals to Clone of V2:"+v1.clone().equal((v2).clone()));
        //Iterator test
        System.out.println("Iterating V1:");
        for(double val:v1){
            System.out.println(val+" ");
        }
        System.out.println("Iterating V2:");
        for(double val:v2){
            System.out.println(val+" ");
        }
    }
}