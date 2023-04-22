import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Class that implements reading from data.txt CSV file
 */
public class HelperUtil {
    private static HelperUtil helperUtil = null;
    private static final File file = new File("src/main/resources/data.txt");

    /**
     * Private default HelperUtil constructor
     */
    private HelperUtil() {

    }

    /**
     * @return instance of HelperUtil class
     */
    static HelperUtil getInstance() {
        return Objects.requireNonNullElseGet(helperUtil, () -> (helperUtil =
                new HelperUtil()));
    }

    /**
     * Reads from CSV file data <br>
     *
     * @return ArrayList of Student entities
     */
    public ArrayList<Student> readFromCSVFile() {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        String readingStr;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            readingStr = bufferedReader.readLine();
            while ((readingStr = bufferedReader.readLine()) != null) {
                String[] splitedCSVString = readingStr.split(",");
                studentArrayList.add(
                        new Student(
                                Integer.parseInt(splitedCSVString[0]),
                                splitedCSVString[1],
                                splitedCSVString[2],
                                Integer.parseInt(splitedCSVString[3]),
                                Integer.parseInt(splitedCSVString[4]),
                                Integer.parseInt(splitedCSVString[5])
                        )
                );
            }
        } catch (IOException exception) {
            System.out.println("Exception!");
            exception.printStackTrace();
        }

        return studentArrayList;
    }

    /**
     * Displays ArrayList of Students on System.out
     *
     * @param studArrayList not null ArrayList of Student entities
     */
    public void showStudentArrayList(@NotNull ArrayList<Student> studArrayList) {
        for (Student student : studArrayList) {
            for (Faculties faculty : Faculties.values()) {
                if (student.getFaculty() == faculty.ordinal() + 1)
                    if (faculty.ordinal() + 1 == student.getFaculty()) {
                        System.out.println(student.getId() + " "
                                + student.getName() + " "
                                + student.getSurname() + " "
                                + student.getYearOfBirth() + " "
                                + student.getYearOfIntroduction() + " "
                                + " " + faculty + "\t" + student.getFaculty());
                        break;
                    }
            }
        }
    }


}