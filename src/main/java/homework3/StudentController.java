package homework3;

import java.util.List;

public class StudentController {

    private StudentGroupService studentGroupService;

    public StudentController() {
        this.studentGroupService = new StudentGroupService();
    }

    public StudentController(StudentGroupService studentGroupService) {
        setStudentGroupService(studentGroupService);
    }

    public void setStudentGroupService(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public boolean removeStudent(String firstName, String lastName) {
        return studentGroupService.remove(firstName, lastName);
    }

    public void sortStudentsById() {
        studentGroupService.sortStudentsById();
    }

    public void sortStudentsByFullName() {
        studentGroupService.sortStudentsByFullName();
    }
    public void sortStreams(List<Stream> streams) {
        StreamService streamService = new StreamService();
        streamService.sortStreams(streams);
    }
}

