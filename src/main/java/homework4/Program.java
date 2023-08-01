package homework4;

import homework4.data.Student;
import homework4.data.StudentGroup;
import homework4.data.Teacher;
import homework4.data.User;
import homework4.view.StudentView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        User student1 = new Student("nikita", "nikiforov");
        User student2 = new Student("ikita", "nikiforov");
        User student3 = new Student("kita", "nikiforov");
        User student4 = new Student("ita", "nikiforov");
        User student5 = new Student("niita", "nikiforov");
        User student6 = new Student("pikita", "nikiforov");

        User teacher = new Teacher("Debil", "Debilovich", "Algebra");
        System.out.println(teacher.toString());
        List<Student> studentList = new ArrayList<>();

        StudentGroup students = new StudentGroup((Teacher) teacher, studentList);
        students.createStudent((Student)student1);
        students.createStudent((Student)student2);
        students.createStudent((Student)student3);
        students.createStudent((Student)student4);
        students.createStudent((Student)student5);
        students.createStudent((Student)student6);

        StudentView studentView = new StudentView();
        System.out.println(students);
    }
}