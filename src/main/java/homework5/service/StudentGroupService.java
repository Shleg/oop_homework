package homework5.service;

import homework5.model.Student;
import homework5.model.StudentGroup;
import homework5.model.Teacher;

import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
        return this.studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Teacher getTeacher() {
        return studentGroup.getTeacher();
    }
}
