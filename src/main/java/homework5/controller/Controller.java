package homework5.controller;

import homework5.model.*;
import homework5.service.DataService;
import homework5.service.StudentGroupService;
import homework5.view.StudentView;

import javax.swing.text.View;
import java.util.List;

public class Controller {
    DataService dataService = new DataService();

    StudentGroupService studentGroupService = new StudentGroupService();

    StudentView studentView = new StudentView();

    public void createStudent(String name, String surname) {
        dataService.createUser(name, surname, Type.STUDENT);
    }

    public List<Student> getAllStudents() {
        List<Student> students = dataService.getAllStudents();
        for (Student student: students) {
            studentView.printStudent(student);
        }
        return students;
    }

    public Teacher getTeacher() {
        return studentGroupService.getTeacher();
    }

    public void createStudentGroup(){
        studentGroupService.createStudentGroup(getTeacher(), getAllStudents());
    }

}
