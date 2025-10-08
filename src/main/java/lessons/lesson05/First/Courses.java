package lessons.lesson05.First;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Courses {
    private static String courseName;
    private static Teacher teacher;
    private static List<Student> students;

    public Courses(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " added to course " + courseName);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println(student.getName() + " deleted from course " + courseName);
    }

    public void markAttendance(Student student, LocalDate date, boolean done) {
        student.getAttendance().put(date, done);
    }

    public void gradeHomework(Student student, int HomeworkNum, int grade) {
        if (HomeworkNum < 1 || HomeworkNum > 10)
            System.out.println("Homework number must be between 1 and 10");
        else
            student.getHomeworkGrades()[HomeworkNum - 1] = grade;
    }

    public void showCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Students:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getName() +
                " Total grade: " + student.getTotalGrade() +
                " Attendance: " + student.getAttendanceGrade());
        }
    }

}
