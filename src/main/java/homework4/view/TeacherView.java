package homework4.view;

import homework4.data.Teacher;
import homework4.data.User;

import java.util.List;

public class TeacherView implements UserViewInterface<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teacherList) {
        for (Teacher teacher: teacherList) {
            System.out.println(teacher.getName() + " " + teacher.getSurname() + ". Предмет: " + teacher.getSubject());
        }
    }
}
