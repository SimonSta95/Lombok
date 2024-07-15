public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1,"Simon");
        Student s2 = new Student(2,"Marcel");
        Student s3 = new Student(3,"Mike");

        Teacher t1 = new Teacher(1,"Florian", "Java");
        Teacher t2 = new Teacher(2,"Martin", "JavaScript");

        Course c1 = new Course(1,"FullStack Java", t1);

        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);

        s1.setGrade(1.5);
        s1.setAddress("Köln");
        s2.setGrade(2);
        s2.setAddress("Hamburg");
        System.out.println(s2.getName());
        System.out.println(c1.getStudents());
    }
}
