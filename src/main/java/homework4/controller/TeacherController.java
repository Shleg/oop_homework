package homework4.controller;

import homework4.data.Teacher;
import homework4.service.TeacherService;
import homework4.view.TeacherView;

public class TeacherController implements IUserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();


    @Override
    public void create(String name, String surname) {
        teacherService.create(name, surname);
    }

    public void editTeacher(String name, String surname, String subject) {
        teacherService.editTeacher(name, surname, subject);
    }

    public void getAllTeachers() {
        teacherView.sendOnConsole(teacherService.getAllTeachers());
    }

    /*
    здесь мы используем первый принцип SOLID, так как данный класс может измениться по 2 причинам, если поменяется
    логика создания и/или редактирования учителя, эта логика выделена в отдельный класс
     */
}
