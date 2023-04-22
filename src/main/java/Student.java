
import java.util.Objects;

/**
 * Class that represents Student entity
 */
public class Student {
    private int id;
    private String name;
    private String surname;
    private int faculty;
    private int yearOfBirth;
    private int yearOfIntroduction;

    /**
     * Constructor with parameters
     * @param id id of a Student
     * @param name name of a Student
     * @param  surname surname of a Student
     * @param yearOfBirth year of birth of a Student
     * @param yearOfIntroduction year of introduction of a student
     * @param faculty integer value which represents the id number of the faculty
     */
    public Student(int id, String name, String surname, int yearOfBirth, int yearOfIntroduction, int faculty) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.yearOfBirth = yearOfBirth;
        this.yearOfIntroduction = yearOfIntroduction;
    }

    /**
     * Copy constructor
     * @param student Student entity which is necessary to create an object with identical properties
     */
    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.surname = student.surname;
        this.faculty = student.faculty;
        this.yearOfBirth = student.yearOfBirth;
        this.yearOfIntroduction = student.yearOfIntroduction;
    }

    /**
     * Default constructor
     */
    public Student() {
        this(-1, "NONE", "NONE", -1, -1, -1);
    }

    /**
     * Name getter
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Surname getter
     * @return String surname
     */

    public String getSurname() {
        return surname;
    }

    /**
     * Faculty getter
     * @return id of a faculty
     */

    public int getFaculty() {
        return faculty;
    }

    /**
     * Year of birth getter
     * @return int year of birth
     */

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Year of introduction getter
     * @return int year of introduction
     */

    public int getYearOfIntroduction() {
        return yearOfIntroduction;
    }

    /**
     * ID getter
     * @return int id
     */

    public int getId() {
        return id;
    }

    /**
     * Equals() method overriding that compares two Students <br>
     * @return true - if students are equal, false - OTHERWISE
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && faculty == student.faculty && yearOfBirth ==
                student.yearOfBirth && yearOfIntroduction == student.yearOfIntroduction
                && name.equals(student.name) && surname.equals(student.surname);
    }

    /**
     * Hashcode() representation of Student entity <br>
     * @return  int representation of Student object
     */

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, faculty, yearOfBirth, yearOfIntroduction);
    }


    /**
     * Method that creates a new Student instance with the properties of current object <br>
     * @return Student object
     */
    public Student copy() {
        return new Student(this.id, this.name, this.surname,
                this.yearOfBirth, this.yearOfIntroduction, this.faculty);
    }

    /**
     * Method that represents Student entity as a String <br>
     * @return String representation of Student entity
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty=" + faculty +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfIntroduction=" + yearOfIntroduction +
                '}';
    }
}