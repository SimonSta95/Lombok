import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class Course {
    private final int id;
    private final String name;
    private final Teacher teacher;
    private List<Student> students;

    public void addStudent(Student student) {
        if (students == null) {
            students = new ArrayList<>();
        }

        students.add(student);
    }

    public void removeStudent(Student student) {
        if (students != null) {
            students.remove(student);
        }
    }

}
