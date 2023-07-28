package homework5.service;

import homework5.model.Student;
import homework5.model.StudentGroup;
import homework5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {

    private List<StudentGroup> studentGroups;

    public StudentGroupService() {
        this.studentGroups = new ArrayList<>();
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        int id = studentGroups.size();
        StudentGroup studentGroup = new StudentGroup(id, teacher, students);
        studentGroups.add(studentGroup);
        return studentGroup;
    }
}
