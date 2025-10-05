package Triangle;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private static int objectCount;
    private boolean isRightAngled=false;
    //default
    public Triangle(){
        this.sideA=1.0;
        this.sideB=1.0;
        this.sideC=1.0;
        objectCount++;
        checkRightAngleTriangle();
    }
    //Equilateral
    public Triangle(double side){
        this.sideA=side;
        this.sideB=side;
        this.sideC=side;
        objectCount++;
        checkRightAngleTriangle();
    }
    //Isoceles
    public Triangle(double x,double y){
        this.sideA=x;
        this.sideB=x;
        this.sideC=y;
        objectCount++;
        checkRightAngleTriangle();
    }
    //Scalene
    public Triangle(double x,double y,double z){
        this.sideA=x;
        this.sideB=y;
        this.sideC=z;
        objectCount++;
        checkRightAngleTriangle();
    }
    //copy
    public Triangle(Triangle other){
        this.sideA=other.sideA;
        this.sideB=other.sideB;
        this.sideC=other.sideC;
    }
    //set
    public void setSideA(double sideA){
        this.sideA=sideA;
    }
    public void setSideB(double sideB){
        this.sideB=sideB;
    }
    public void setSideC(double sideC){
        this.sideC=sideC;
    }
    //get
    public double getSideA(){
        return sideA;
    }
    public double getSideB(){
        return sideB;
    }
    public double getSideC(){
        return sideC;
    }
    //Object Count
    public double getObjectCount(){
        return objectCount;
    }
    //perimeter
    public double perimeter(){
        return sideA+sideB+sideC;
    }
    //Right angle
    public boolean  checkRightAngleTriangle(){
        double a=sideA*sideA;
        double b=sideB*sideB;
        double c=sideC*sideC;
        if(a+b==c || a+c==b || b+c==a){
            isRightAngled=true;
        }else{
            isRightAngled=false;
        }
        return isRightAngled;
    }
    //toString
     @Override
    public String toString() {
        return "[sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]"+
        "\n Object count:"+objectCount+
        "\n Perimeter:"+perimeter()+
        "\nCheck Right Angle Triangle:"+checkRightAngleTriangle();
    }
}
