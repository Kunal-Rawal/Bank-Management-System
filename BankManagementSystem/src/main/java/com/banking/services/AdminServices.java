//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.banking.services;

import com.banking.Storage.DataStorage;
import com.banking.entity.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AdminServices {
    private static List<User> listUsers;

    static {
        listUsers = DataStorage.Users;
    }

    public AdminServices() {
    }

    public List<User> getAllCustomers() {
        System.out.println(listUsers);
        return listUsers;
    }

    public User getCustomerById(int id) {
        for(int i = 0; i < listUsers.size(); ++i) {
            if (((User)listUsers.get(i)).getId() == id) {
                return (User)listUsers.get(i);
            }
        }

        return null;
    }

    public void addUser(User user) {
        listUsers.add(user);
    }
}
