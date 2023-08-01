package homework4.view;


import homework4.data.User;

import java.util.List;

public interface UserViewInterface<T extends User> {
    public void sendOnConsole(List<T> listT);
}