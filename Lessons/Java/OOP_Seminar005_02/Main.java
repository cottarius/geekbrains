import controller.Controller;
import model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        Teacher teacher1 = new Teacher("Eldar Ryazanov", 1927, Disciple.RUSSIAN_ACTORS_SCHOOL);
        Student student1 = new Student("Vladimir Mashkov", 1963);
        Student student2 = new Student("Alexandr Petrov", 1989);
        Student student3 = new Student("Konstantin Khabenskiy", 1972);
        List<Student> russianGroup = new ArrayList<>(Arrays.asList(student1, student2, student3));

        Teacher teacher2 = new Teacher("Roman Polansky", 1933, Disciple.AMERICAN_ACTORS_SCHOOL);
        Student student4 = new Student("Tom Cruise", 1962);
        Student student5 = new Student("Al Pacino", 1940);
        Student student6 = new Student("Johnny Depp", 1963);
        Student student7 = controller.addStudent ("Brad Pitt", 1963);
        List<Student> americanGroup = new ArrayList<>(Arrays.asList(student4, student5, student6, student7));

        StudyGroup group1 = controller.createGroup(russianGroup, teacher1);
        controller.read(group1);
        StudyGroup group2 = controller.createGroup(americanGroup, teacher2);
        controller.read(group2);

        StudentResidence room101;
        room101 = controller.createRoom(101, russianGroup);

        StudentResidence room102;
        room102 = controller.createRoom(102, americanGroup);


        List<StudentResidence> rooms = new ArrayList<>();
        rooms.add(room101);
        rooms.add(room102);

        for (StudentResidence room : rooms){
            controller.getRoom(room);
        }
    }
}
