package homework4.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User {

    private String subject;

    public Teacher(String name, String surname) {
        super(name, surname);
    }
    public Teacher(String name, String surname, String subject) {
        super(name, surname);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                ", name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", subject='" + this.getSubject() + '\'' +
                '}';
    }
}