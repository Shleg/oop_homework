package homework3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Stream implements Iterator<StudentGroup> {

    private List<StudentGroup> studentGroups;
    private int currentIndex;

    public Stream(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more StudentGroups in the stream.");
        }
        return studentGroups.get(currentIndex++);
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }
}

