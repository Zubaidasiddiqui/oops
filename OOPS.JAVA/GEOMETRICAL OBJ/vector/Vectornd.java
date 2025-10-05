import java.util.*;
public class Vectornd implements Iterable<Double>,Cloneable {
    private ArrayList<Double>coordinates;
    private int dimensions;
    
    //null
    public Vectornd(){
        this.coordinates=new ArrayList<>();
        this.dimensions=0;
    }
    //parameterized
    public Vectornd(double...values){
        this.coordinates=new ArrayList<>();

        for(Double val:values){
            this.coordinates.add(val);
        }

        this.dimensions=this.coordinates.size();
    }
    //copy
    public Vectornd(Vectornd other){
        this.coordinates=new ArrayList<>(other.coordinates);
        this.dimensions=other.dimensions;
    }

    //setter
    public void set(int index,double values){
        if (index<0 && index>=this.dimensions) {
            throw new IndexOutOfBoundsException("Invalid index:"+index);
        }
        this.coordinates.set(index, values);
    }
    //getter for index
    public double getIndex(int index){
        if (index<0 && index>=this.dimensions) {
            throw new IndexOutOfBoundsException("Invalid index:"+index);
        }
        return this.coordinates.get(index);
    }
    //getter for dimension
    public double getDimensions(int dimensions){
        return this.dimensions;
    }

    //magnitude
    public double  magnitude(){
        double sum=0;
        for (int i = 0; i < this.coordinates.size(); i++) {
            double n=this.coordinates.get(i);
            sum+=n*n;
        }
        return Math.sqrt(sum);
    }
    //addition
    public Vectornd add(Vectornd other){
        if(this.dimensions!=other.dimensions){
            throw new IllegalArgumentException("Vectors must have same dimension");
        }
        Vectornd newvectornd=new Vectornd();
        newvectornd.dimensions=this.dimensions;
        for (int i = 0; i < this.coordinates.size(); i++) {
            newvectornd.coordinates.add(this.coordinates.get(i)+other.coordinates.get(i));
        }
        return newvectornd;
    }
    //subtract
    public Vectornd subtract(Vectornd other){
        if(this.dimensions!=other.dimensions){
            throw new IllegalArgumentException("Vectors must have same dimensions");
        }
        Vectornd newvector=new Vectornd();
        newvector.dimensions=this.dimensions;
        for (int i = 0; i < this.coordinates.size(); i++) {
            newvector.coordinates.add(this.coordinates.get(i)-other.coordinates.get(i));   
        }
        return newvector;
    }
    //dot product
    public Vectornd dotproduct(Vectornd other){
        if(this.dimensions!=other.dimensions){
            throw new IllegalArgumentException("Vectors must have same dimensions");
        }
        Vectornd newvector=new Vectornd();
        newvector.dimensions=this.dimensions;
        for (int i = 0; i < coordinates.size(); i++) {
            newvector.coordinates.add(this.coordinates.get(i)*other.coordinates.get(i));
        }
        return newvector;
    }
    //cross product
    public Vectornd crossproduct(Vectornd other){
        if(this.dimensions!=3 && other.dimensions!=3){
            throw new IllegalArgumentException("Cross product is only valid for 3D vectors");
        }
        double x1=this.coordinates.get(0);
        double y1=this.coordinates.get(1);
        double z1=this.coordinates.get(2);

        double x2=other.coordinates.get(0);
        double y2=other.coordinates.get(1);
        double z2=other.coordinates.get(2);

        double cx=y1*z2-z1*y2;
        double cy=x1*z2-z1*x2;
        double cz=x1*y2-y1*x2;

        return new Vectornd(cx,cy,cz);

    }
    //toString
    @Override
    public String toString(){
        return coordinates.toString();
    }

    //clone
    @Override
    public Vectornd clone(){
        Vectornd clone=new Vectornd();
        clone.dimensions=this.dimensions;
        clone.coordinates=new ArrayList<>(this.coordinates);

        return clone;
    }
    //iterator
    @Override
    public Iterator<Double>iterator(){
        return coordinates.iterator();
    }
    //equal object
    public boolean equal(Object obj){
        if (this==obj) 
          return true;
        if (obj==null && this.getClass()!=obj.getClass())
          return false; 
        
        Vectornd other=(Vectornd)obj;
        if(this.dimensions!=other.dimensions)
          return false;
        
        return this.coordinates.equals(other.coordinates);
    }
        
}
    
    
