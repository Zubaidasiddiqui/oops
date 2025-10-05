package Point;

public class Point implements Cloneable{
    private int x;
    private int y;
    //null
    public Point(){
        this.x=0;
        this.y=0;
    }
    //para
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    //copy
    public Point(Point other){
        this.x=other.x;
        this.y=other.y;
    }
    //set
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    //get
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    //compare
    public float compareTo(Point other){
        int output=0;
        //for X
        if(this.x<other.x){
            System.out.println("For x:"+this.x+"is less than"+other.x);
            output=-1;
        }
        else if(this.x>other.x){
            System.out.println("For x"+this.x+"is greater than"+other.x);
            output=1;
        }else{
            System.out.println("Both points are equal");
            output=0;
        }
        //For Y

        if(this.y<other.y){
            System.out.println("For y:"+this.y+"is less than"+other.y);
            output=-1;
        }
        else if(this.y>other.y){
            System.out.println("For y:"+this.y+"is greater than"+other.y);
            output=1;
        }else{
            System.out.println("Both points are equal");
            output=0;
        }
        return output;
    }   
    
    //clone
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return"(" +x+ "," +y+ ")";
    }
}