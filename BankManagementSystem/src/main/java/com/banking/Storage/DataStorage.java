//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.banking.Storage;

import com.banking.entity.User;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    public static List<User> Users = new ArrayList<User>();

    static {
        Users.add(new User(1, "Kunal", "12345", "8827182619", "kunal.rawal2@gmail.com"));
        Users.add(new User(2, "Kunal", "1234", "8827182618", "kunal.rawal23@gmail.com"));
        Users.add(new User(3, "Kunal", "123", "8827182617", "kunal.rawal24@gmail.com"));
        Users.add(new User(4, "Kunal", "12", "8827182616", "kunal.rawal26@gmail.com"));
        Users.add(new User(5, "Kunal", "1", "8827182615", "kunal.rawal29@gmail.com"));
    }

    public DataStorage() {
    }
}
