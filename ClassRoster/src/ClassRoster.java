import java.util.ArrayList;

public class ClassRoster{
    //instance variables
    private String courseName;
    private int noOfStudents;
    private String teacher;
    public static int instances = 0;

    private static ArrayList<Student> studentList = new ArrayList<Student>();
    //Getters
    public String getCourseName(){
        return this.courseName;
    }
    public int getNoOfStudents(){
        return this.noOfStudents;
    }
    //Setters
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public void setNoOfStudents(int noOfStudents){
        this.noOfStudents = noOfStudents;
    }


    public ClassRoster( int noOfStudents ){
        //create a two-arg constructor here
        this.studentList = new ArrayList<Student>();
        instances++;
        this.noOfStudents = 0;
        this.courseName = "Not Set";


    }

    public String studentWithMaxGPA(){

        int highestGPA = arr[0] || null;

        // Current number, handled by the loop
        int number = 0;
        for (var i = 0; i < arr.length; i++) {
            // Update current number
            number = arr[i];

            // Compares stored largest number with current number, stores the largest one
            highestGPA = Math.max(highestGPA, number);
        }

        return largest;

        return null;//return the last name of the highest GPA
    } // end method studentWithMaxGPA

    public int dropStudent( double minGPALevel ){

        return 0;
    } // end method dropStudent

    public boolean addStudent(Student newStudent ){
        if (Student==null || studentList.contains(Student)) {
            return false;
        }
        studentList.add(Student);
        return true;
    } // end method addStudent

    public void addStudent(int index, Student newStudent) {
        if (newStudent == null) {
            return;
        } else {
            this.students.add(newStudent);
        }
    }

    public String toString(){
        String output = new String();
        output += "Class: " + courseName + "\n";

        for( Student student: studentList ){
            output += student + "\n";
        } // end for
        return output;
    } // end method toString
} // end ClassRoster
