public class Main {
    public static void main(String[] args) {

        Course course1=new Course();
        course1.setName("Mathematics");
        course1.setDate("10.02.2022");
        course1.setId(1);
        course1.setFioTeacher("Alex");

        Course course2=new Course();
        course2.setName("It");
        course2.setDate("25.02.2022");
        course2.setId(2);
        course2.setFioTeacher("Marina");

        Course[]courses=new Course[2];
        courses[0]=course1;
        courses[1]=course2;


        Student student1=new Student();
        student1.setFirstName("Adilet");
        student1.setLastName("idinkulov");
        student1.setDateOfBirth("1990");
        student1.setAge(32);

        Student student2=new Student();
        student2.setFirstName("Janara");
        student2.setLastName("Aidarova");
        student2.setDateOfBirth("1989");
        student2.setAge(33);

        Student student3=new Student();
        student3.setFirstName("Maksat");
        student3.setLastName("Isanov");
        student3.setDateOfBirth("1988");
        student3.setAge(34);

        Student student4=new Student();
        student4.setFirstName("Oksana");
        student4.setLastName("Mihailova");
        student4.setDateOfBirth("1991");
        student4.setAge(31);

        Student[]students=new Student[4];
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        students[3]=student4;


        Group group1=new Group();
        group1.setStudents(students);
        group1.setCourse(courses);
        group1.setDateOfStart("10.02.2022");
        group1.setStudyPeriodMonth(9);

        System.out.println(group1);
    }
}
