package homework3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream stream1, Stream stream2) {
        int size1 = stream1.getStudentGroups().size();
        int size2 = stream2.getStudentGroups().size();

        return Integer.compare(size1, size2);
    }
}

