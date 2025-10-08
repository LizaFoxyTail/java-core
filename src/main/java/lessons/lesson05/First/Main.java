package lessons.lesson05.First;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("T1", "Иванов Иван Владимирович");
        Teacher teacher2 = new Teacher("T1", "Романенко Марина Анатольевна");

        Student student1 = new Student("S1", "Смирнов Виталий Олегович");
        Student student2 = new Student("S2", "Рощупкина Ульяна Сергеевна");

        Courses course = new Courses("Java Basics", teacher1);


        course.addStudent(student1);
        course.addStudent(student2);

        course.markAttendance(student1, LocalDate.of(2025, 9, 1), true);
        course.markAttendance(student2, LocalDate.of(2025, 9, 1), true);

        course.markAttendance(student1, LocalDate.of(2025, 9, 2), true);
        course.markAttendance(student2, LocalDate.of(2025, 9, 2), false);

        course.gradeHomework(student1, 1, 10);
        course.gradeHomework(student1, 2, 8);
        course.gradeHomework(student2, 1, 9);
        course.gradeHomework(student2, 2, 10);

        course.showCourseInfo();

        course.removeStudent(student2);

        course.showCourseInfo();
    }
}