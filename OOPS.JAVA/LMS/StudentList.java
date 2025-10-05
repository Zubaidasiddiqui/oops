import java.util.ArrayList;
import java.util.Comparator;

public class StudentList {
    private ArrayList<Student>students;
    //null
    public StudentList(){
        this.students=new ArrayList<>();
    }
    //parameterized
    public StudentList(ArrayList<Student>students){
        this.students=new ArrayList<>(students);
    }
    //copy
    public StudentList(StudentList other){
        this.students=new ArrayList<>(other.students);
    }
    //add
    public void addStudent(Student s){
        this.students.add(s);
    }
    //remove
    public void removeStudent(Student s){
        this.students.remove(s);
    }
    //search 
    public Student searchByName(String name){
        for(Student s:students){
            if(s.getName().equalsIgnoreCase(name)){
                return s;
            }
        }
        return null;
    }
    
    public Student searchBySeatno(String seatno){
        for(Student s:students){
            if(s.getSeatno().equalsIgnoreCase(seatno)){
                return s;
            }
        }
        return null;
    }
    //sort
    public void sortByName(){
        this.students.sort(Comparator.comparing(Student::getName));
    }
    public void sortBySeatno(){
        this.students.sort(Comparator.comparing(Student::getSeatno));
    }
    //clone
    public Object clone(){
        StudentList cloned=new StudentList();
        for(Student s:students){
            cloned.addStudent(new Student(s));
        }
        return cloned;
    }

    @Override
    public String toString() {
        String output="\n";
        int i=1;
        for(Student s:students){
            output+="---------------------------------------------\n";
            output+="Student"+i+++"\n";
            output+=s.toString()+"\n";
        }
        return output;
    }

}
