package homework4.data;

import java.time.LocalDate;

public class User {
    private String name;
    private String surname;


    public User(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + name + '\'' +
                ", secondName='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getName() != null ? !getName().equals(user.getName()) :
                user.getName() != null) {
            return false;
        }
        if (getSurname() != null ? !getSurname().equals(user.getSurname()) :
                user.getSurname() != null) {
            return false;
        }
        return true;
    }
}