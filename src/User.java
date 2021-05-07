import java.util.Locale;

public class User {
    int id;
    String name;
    String surname;

    public User(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name.concat(" ");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surname.toUpperCase().concat(" ");
    }

    public void setSurName(String surName) {
        this.surname = surName;
    }


}
