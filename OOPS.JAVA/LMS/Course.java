public class Course implements Cloneable {
    private String name;
    private String courseno;
    //null
    public Course(){
        this.name="";
        this.courseno="";
    }
    //parameterized
    public Course(String name,String courseno){
        this.name=name;
        this.courseno=courseno;
    }
    //copy
    public Course(Course other){
        this.name=other.name;
        this.courseno=other.courseno;
    }
    //set
    public void setName(String name){
        this.name=name;
    }
    public void setCourseno(String courseno){
        this.courseno=courseno;
    }
    //get
    public String getName(){
        return name;
    }
    public String getCourseno(){
        return courseno;
    }
    //clone
    public Object clone() throws CloneNotSupportedException{
        return new Course(this);
    }
    @Override
    public String toString(){
        return " Course name :" +name+     "\n"+
               " Course no   :" +courseno+ "\n";
    }
}
