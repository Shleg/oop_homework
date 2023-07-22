package homework3;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private Integer id;
    private String firstName;
    private String lastName;

    public Student(Integer id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);

    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) { this.id = id; }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + this.getId() +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public int compareTo(Student student) {
        return this.id.compareTo(student.id);
    }
}

