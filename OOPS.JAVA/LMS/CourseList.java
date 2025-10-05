import java.util.ArrayList;
import java.util.Comparator;
public class CourseList {
    private ArrayList<Course>courses;
    //null
    public CourseList(){
        this.courses=new ArrayList<>();
    }
    //parameterized{
    public CourseList(ArrayList<Course>courses){
        this.courses=new ArrayList<>(courses);
    }
    //copy
    public CourseList(CourseList other){
        this.courses=new ArrayList<>(other.courses);
    }
    //add
    public void addCourse(Course c){
        this.courses.add(c);
    }
    //remove
    public void removeCourse(Course c){
        this.courses.remove(c);
    }
    //search 
    public Course searchByName(String name){
        for(Course c:courses){
            if(c.getName().equalsIgnoreCase(name)){
                return c;
            }
        }
        return null;
    }
    public Course searchByNumber(String courseno) {
        for (Course c : courses) {
            if (c.getCourseno().equalsIgnoreCase(courseno)) {
                return c;
            }
        }
        return null;
    }
    //sort
    public void sortByName(){
        this.courses.sort(Comparator.comparing(Course::getName));
    }
    public void sortByCourseno(){
        this.courses.sort(Comparator.comparing(Course::getCourseno));
    }
    //clone
    public Object clone(){
        CourseList cloned=new CourseList();
        for(Course c:courses){
            cloned.addCourse(new Course(c));
        }
        return cloned;
    }
    @Override
    public String toString() {
        String output="\n";
        int i =1;
        for(Course c:courses){
            output+="---------------------------------\n";
            output+="Course"+i+++"\n";
            output+=c.toString()+"\n";
        }
        return output;
    }

}