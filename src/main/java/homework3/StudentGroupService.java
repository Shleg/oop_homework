package homework3;

import java.util.Collections;
import java.util.List;
public class StudentGroupService {
    private StudentGroup studentGroup;
    public StudentGroupService() {
        this.studentGroup = new StudentGroup();
    }

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public boolean remove(String firstName, String lastName) {
        Student studentRem = new Student(null, firstName, lastName);
        if (studentGroup.getStudentList() == null) return false;
        List<Student> studentList = studentGroup.getStudentList();
        for (Student student: studentList) {
            if (student.equals(studentRem)){
                studentList.remove(student);
                return true;
            }
        }
        return false;
    }
    public void sortStudentsById() {
        List<Student> studentList = studentGroup.getStudentList();
        Collections.sort(studentList);
    }

    public void sortStudentsByFullName() {
        List<Student> studentList = studentGroup.getStudentList();
        StudentComparator comparator = new StudentComparator();
        Collections.sort(studentList, comparator);
    }
}

