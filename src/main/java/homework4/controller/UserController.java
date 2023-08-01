package homework4.controller;

import homework4.data.User;

import java.time.LocalDate;

public class UserController implements IUserController{
    @Override
    public void create(String name, String surname){
        User newUser = new User(name, surname);
    }
    public void printConsole(User user){

    }
}
