package homework5.model;

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> students;

    private int studentsGroupId;

    public StudentGroup(int studentsGroupId, Teacher teacher, List<Student> studentList) {
        this.studentsGroupId = studentsGroupId;
        this.teacher = teacher;
        this.students = studentList;
    }

    public int getStudentsGroupId() {
        return studentsGroupId;
    }

    public void setStudentsGroupId(int studentsGroupId) {
        this.studentsGroupId = studentsGroupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
