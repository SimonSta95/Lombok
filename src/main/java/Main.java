public class Main {
    public static void main(String[] args) {

        Student s1 = Student.builder()
                            .id(1)
                            .name("Simon")
                            .build();

        Student s2 = Student.builder()
                            .id(2)
                            .name("Marcel")
                            .build();

        Student s3 = Student.builder()
                            .id(3)
                            .name("Mike")
                            .build();

        Teacher t1 = Teacher.builder()
                            .id(1)
                            .name("Florian")
                            .subject("Java")
                            .build();


        Teacher t2 = Teacher.builder()
                            .id(2)
                            .name("Martin")
                            .subject("JavaScript")
                            .build();

        Course c1 = Course.builder()
                          .id(1)
                          .name("FullStack Java")
                          .teacher(t1)
                          .build();

        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);

        s1.setGrade(1.5);
        s1.setAddress("Köln");
        s2.setGrade(2);
        s2.setAddress("Hamburg");

        t2.withSubject("Java");
        System.out.println(s2.getName());
        System.out.println(c1.getStudents());
    }
}

