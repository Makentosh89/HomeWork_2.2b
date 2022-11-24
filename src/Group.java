import java.util.Arrays;

public class Group {
    private Student[] students;
    private Course[] course;
    private String dateOfStart;
    private int studyPeriodMonth;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course[] getCourse() {
        return course;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public int getStudyPeriodMonth() {
        return studyPeriodMonth;
    }

    public void setStudyPeriodMonth(int studyPeriodMonth) {
        this.studyPeriodMonth = studyPeriodMonth;
    }

    @Override
    public String toString() {
        return " dateOfStart : " + getDateOfStart() + "\n studyPeriodMonth : " + getStudyPeriodMonth() +" monthes "+
                "\n Course : " + Arrays.toString(getCourse())+ "\nStudent : " + Arrays.toString(getStudents()) ;
    }



}
