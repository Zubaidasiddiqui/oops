public class Student implements Cloneable{
    private String name;
    private String seatno;
    private CourseList course;
    //null
    public Student(){
        this.name="";
        this.seatno="";
        this.course=null;
    }
    //parameterized
    public Student(String name,String seatno,CourseList course){
        this.name=name;
        this.seatno=seatno;
        this.course=course;
    }
    //copy 
    public Student(Student other){
        this.name=other.name;
        this.seatno=other.seatno;
        this.course=other.course;
    }
    //set
    public void setName(String name){
        this.name=name;
    }
    public void setSeatno(String seatno){
        this.seatno=seatno;
    }
    public void setCourse(CourseList course){
        this.course=course;
    }
    //get
    public String getName(){
        return name;
    }
    public String getSeatno(){
        return seatno;
    }
    public CourseList getCourse(){
        return course;
    }   
    //clone
    public Object clone() throws CloneNotSupportedException{
        return new Student(this);
    }
    @Override
    public String toString(){
        return " Name of Student :" +name+   "\n"+
               " Seatno          :" +seatno+ "\n"+
                 course.toString();
    }
}