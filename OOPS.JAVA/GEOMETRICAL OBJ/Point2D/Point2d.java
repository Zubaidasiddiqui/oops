package Shallowdeep;

public class Point2d {
    private int x;
    private int y;

    //null
    public Point2d(){
        this.x=0;
        this.y=0;
    }
    //parameterized
    public Point2d(int x,int y){
        this.x=x;
        this.y=y;
    }
    //copy
    public Point2d(Point2d other){
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
        return x;
    }
    public int getY(){
        return y;
    }
    @Override
    public String toString(){
        return"(x:"+x+",y:"+y+")";
    }
    
}
