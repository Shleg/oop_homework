package homework4.data;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSurname().compareTo(o2.getSurname());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getName().compareTo(o2.getName());
        }
        return resultOfComparing;
    }
    /*
    в методе compare можно продемострировать третий принцип SOLID, так как при подстановке дочерних классов Студент или
    Учитель метод отработает корректно
     */
}
