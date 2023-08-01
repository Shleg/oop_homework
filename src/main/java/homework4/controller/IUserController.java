package homework4.controller;

import homework4.data.User;

public interface IUserController <T extends User>{
    void create(String name, String surname);
}
