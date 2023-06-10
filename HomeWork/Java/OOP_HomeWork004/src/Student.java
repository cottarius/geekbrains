
import java.time.LocalDate;

public class Student extends User{
    private Long studentId;
    public Student(long studentId,String firstName, String secondName,
                   String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentId;
    }
    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId='" + studentId +'\'' +
               ", firstName='" + super.getFirstName() + '\'' +
               ", secondName='" + super.getSecondName() + '\'' +
               ", patronymic='" + super.getPatronymic() + '\'' +
               ", dateOfBirth=" + super.getDateOfBirth() +
               '}';
    }
}
