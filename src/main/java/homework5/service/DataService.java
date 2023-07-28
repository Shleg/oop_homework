package homework5.service;

import homework5.model.Student;
import homework5.model.Teacher;
import homework5.model.Type;
import homework5.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAllUsers(){
        return this.users;
    }
    public List<Student> getAllStudents() {
        List<Student> resultList = new ArrayList<>();
        for (User user: users) {
            if (user instanceof Student) {
                resultList.add((Student)user);
            }
        }
        return resultList;
    }

    public void createUser(String name, String surname, Type type) {
        int id = getFreeId(type);
        if (type.STUDENT == type) {
            Student student = new Student(id, name, surname);
            users.add(student);
        }
        if (type.TEACHER == type) {
            Teacher teacher = new Teacher(id, name, surname);
            users.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 1;
        boolean isStudent = Type.STUDENT == type;
        for (User user: users) {
            if (isStudent && user instanceof Student) {
                lastId = ((Student) user).getStudentId() + 1;
            }
            if (!isStudent && user instanceof Teacher) {
                lastId = ((Teacher) user).getTeacherId() + 1;
            }

        }
        return lastId;
    }

    public User getUser(Type type, Integer id) {
        User resultUser = null;
        boolean isStudent = Type.STUDENT == type;
        for (User user: users) {
            if (isStudent && user instanceof Student && ((Student) user).getStudentId() == id) {
                resultUser = user;
            }
            if (!isStudent && user instanceof Teacher && ((Teacher) user).getTeacherId() == id) {
                resultUser = user;
            }
        }
        return resultUser;
    }
}
