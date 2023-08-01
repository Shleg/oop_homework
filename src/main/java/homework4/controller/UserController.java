package homework4.controller;

import homework4.data.User;

import java.time.LocalDate;

public class UserController implements IUserController{
    @Override
    public void create(String name, String surname){
        User newUser = new User(name, surname);
    }
    /*
    Тут демонстрируется пятый принцип SOLID, так как создание пользователя связано не напрямую с классом Пользователь,
    а через абстракцию - интерфейс UserController, который обязывает создать метод create.
     */
    public void printConsole(User user){

    }
}
