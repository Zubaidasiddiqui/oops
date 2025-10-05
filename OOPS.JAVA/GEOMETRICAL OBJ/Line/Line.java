package  Line;

public class Line {
    private Point start;
    private Point end;

    public Line(){
        this.start=null;
        this.end=null;
    } 
    public Line(Point start,Point end){
        this.start=start;
        this.end=end;
    }
    public Line(Line other){
        this.start=other.start;
        this.end=other.end;
    }
    public void setStart(Point start){
        this.start=start;
    }
    public void setEnd(Point end){
        this.end=end;
    }
    public Point getStart(){
        return start;
    }
    public Point getEnd(){
        return end;
    }
    @Override
    public String toString(){
        return "Line starts from"+start+"to"+end;
    }
}
