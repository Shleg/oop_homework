package homework4.data;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(String name, String surname) {
        super(name, surname);
    }

    public Student(String firstName, String secondName, Long studentId) {
        super(firstName, secondName);
        this.studentId = studentId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId +'\'' +
                ", firstName='" + super.getName() + '\'' +
                ", secondName='" + super.getSurname() + '\'' +
                '}' + '\n';
    }

    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
