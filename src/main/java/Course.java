import lombok.Builder;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Builder
@Value
public class Course {
    int id;
    String name;
    Teacher teacher;
    List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

}
