
public  class Vector2d {
    private int x;
    private int y;

    public Vector2d(){
        this.x=0;
        this.y=0;
    }
    public Vector2d(int x,int y){
        this.x=x;
        this.y=y;
    }
    public Vector2d(Vector2d other){
        this.x=other.x;
        this.y=other.y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
