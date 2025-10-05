public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        //Courses
        Course c1 = new Course("Object Oriented Programming", "CS-352");
        Course c2 = new Course("Discrete Structures", "CS-358");
        Course c3 = new Course("Digital Logic Design", "CS-354");
        Course c4 = new Course("Linear Algebra", "CS-356");
        Course c5 = new Course("Ideology And Constitution Of Pakistan","CS-362");
        Course c6 = new Course("Communication And Presentation Skills","CS-360");
        Course c7 = new Course("Programming Fundamental","CS-361");
        //CourseList
        CourseList cl=new CourseList();
        //add
        cl.addCourse(c1);
        cl.addCourse(c2);
        cl.addCourse(c3);
        cl.addCourse(c4);
        cl.addCourse(c5);
        cl.addCourse(c6);
        cl.addCourse(c7);
        System.out.println("Course List:"+cl);
        //remove
        cl.removeCourse(c7);
        System.out.println("New Course List:"+cl);
        //search
        cl.searchByName("Discrete Structures");
        cl.searchByNumber("CS-352");
        //sort
        cl.sortByName();
        cl.sortByCourseno();
        System.out.println("Sorted Course List:"+cl);
        //clone
        Course cloned=(Course)c1.clone();
        System.out.println("Cloned Course:\n"+cloned);
        CourseList clonedList=(CourseList)cl.clone();
        System.out.println("Cloned Course List:"+clonedList);
        //students
        Student s1=new Student("Zubaida Siddiqui","B24110006166",cl);
        Student s2=new Student("Sadia Naeem","B24110006125", cl);
        Student s3=new Student("Mubashir Ghouri","B24110006094", cl);
        //StudentList
        StudentList sl=new StudentList();
        //add
        sl.addStudent(s1);
        sl.addStudent(s2);
        sl.addStudent(s3);
        System.out.println("Student List:"+sl);
        //remove
        sl.removeStudent(s3);
        System.out.println("New Student List:"+sl);
        //search
        System.out.println("Search By Name:"+sl.searchByName("Zubaida Siddiqui"));
        System.out.println("Search By SeatNo:"+sl.searchBySeatno("B24110006125"));
        //sort
        sl.sortByName();
        System.out.println("Sorted Student List(NAME)"+sl);
        sl.sortBySeatno();
        System.out.println("Sorted Student List(SEATNO):"+sl);
        //clone
        Student clonedd=(Student)s2.clone();
        System.out.println("Cloned Student:"+clonedd);
        StudentList cloneddList=(StudentList)sl.clone();
        System.out.println("Cloned Student List:"+cloneddList);
    }
}