package homework4.controller;

import homework4.data.Student;
import homework4.view.StudentView;
import homework4.view.UserViewInterface;

import java.time.LocalDate;
import java.util.List;

public class StudentController implements IUserController{

    private UserViewInterface studentsView = new StudentView();
    @Override
    public void create(String name, String surname){
        Student newStudent = new Student(name, surname);
    }
    public void printConsole(List<Student> students){
        studentsView.sendOnConsole(students);
    }
}