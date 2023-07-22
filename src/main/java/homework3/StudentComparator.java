package homework3;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        int result = student1.getLastName().compareTo(student2.getLastName());
        if (result == 0) {
            result = student1.getFirstName().compareTo(student2.getFirstName());
        }
        return result;
    }
}

