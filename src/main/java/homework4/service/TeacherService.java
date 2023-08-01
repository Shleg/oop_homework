package homework4.service;

import homework4.data.Teacher;

import java.util.List;

public class TeacherService {

    private List<Teacher> teacherList;
    public void create(String name, String surname) {
        Teacher teacher = new Teacher(name, surname);
        teacher.setSubject("математика");
        teacherList.add(teacher);
    }

    public void editTeacher(String name, String surname, String subject) {
        for (Teacher teacher: teacherList) {
            if (teacher.getName().equals(name) && teacher.getSurname().equals(surname)) {
                teacher.setSubject(subject);
            }
        }
     }

     public List<Teacher> getAllTeachers(){
        return teacherList;
     }
}
