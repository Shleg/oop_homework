package homework5.model;


public class Teacher extends User {
    private Integer teacherId;

    public Teacher(Integer teacherId, String name, String surname) {
        super(name, surname);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
