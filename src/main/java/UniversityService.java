import java.util.List;

public class UniversityService {

    public double getCourseAvg(Course course){
        List<Student> students = course.getStudents();
        double grades = 0.0;
        int counter = 0;
        double avg = 0.0;


        for(Student student : students){
            grades += student.getGrade();
            counter++;
        }

        return avg = grades/counter;
    }

    public double getAverageOfUni(University university){
        List<Course> courses = university.courses();

        int counter = 0;
        double avg = 0.0;

        for(Course course : courses){
            avg += getCourseAvg(course);
            counter++;
        }

        return avg = avg/counter;
    }

}
