package lessons.lesson05.First;

import java.time.LocalDate;
import java.util.HashMap;

public class Student extends Person {
    private int[] homeworkGrade;
    private HashMap<LocalDate, Boolean> attendance;

    public Student(String id, String name) {
        super(id, name);
        this.homeworkGrade = new int[10];
        this.attendance = new HashMap<>();
    }
    public int[] getHomeworkGrades() {
        return homeworkGrade;
    }

    public HashMap<LocalDate, Boolean> getAttendance() {
        return attendance;
    }

    public int getHomeworkGrade(){
        int point =0;
        for (int i = 0; i<homeworkGrade.length; i++){
            point += homeworkGrade[i];
        }
        return point;
    }

    public int getAttendanceGrade(){
        int point =0;
        for (Boolean done: attendance.values()){
            if (done)
                point++;
        }
        return point;
    }

    public int getTotalGrade(){
        return getHomeworkGrade()+getAttendanceGrade();
    }
}
