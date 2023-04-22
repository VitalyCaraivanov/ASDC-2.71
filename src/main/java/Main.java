
import java.util.ArrayList;

/**
 * Main class which contains main() method
 */
public class Main {
    /**
     * Program start point
     * @param args arguments from command line interface
     */
    public static void main(String[] args) {

        HelperUtil singletonWorker = HelperUtil.getInstance();
        ArrayList<Student> studentArrayList = singletonWorker.readFromCSVFile();
        singletonWorker.showStudentArrayList(studentArrayList);

        Student student = new Student(studentArrayList.get(0));
        Student student1 = student.copy();
        System.out.println(student1);
        System.out.println(student1.equals(student));


        Student copyStudent = student.copy();
        System.out.println(copyStudent.equals(student));


    }





}