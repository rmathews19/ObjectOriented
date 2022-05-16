
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        // 1. Creating and printing ClassRoster
        //create array list
        ClassRoster myPeriod1 = new ClassRoster( "AP Computer Science", myList );
        System.out.println( "Class Roster:\n" + myPeriod1 );

        // 2. Testing studentWithMaxGPA
        System.out.println( "Student with the max GPA is: " + myPeriod1.studentWithMaxGPA() );
        System.out.println( "\n\n" );

        // 3. Testing dropStudent
        System.out.println( "The number of student(s) dropped is " + myPeriod1.dropStudent( 3.0 ) );
        System.out.println( "Class Roster:\n" + myPeriod1 );
        System.out.println( "\n\n" );

        //4 . Testing addStudent
        myPeriod1.addStudent( new Student( "Super", "Woman", 12, 4, 4, 4, 4, 5) );
        System.out.println( "Class Roster:\n" + myPeriod1 );
        System.out.println( "\n\n" );

        //5 . Testing addStudent in a specific location
        myPeriod1.addStudent( 2,new Student( "Zoo", "Lander", 11, 4, 3, 6, 4, 3) );
        System.out.println( "Class Roster:\n" + myPeriod1 );

        System.out.println( "\n\n" );
    }
}