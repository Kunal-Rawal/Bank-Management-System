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
public class UserServices {
    public List<User> listUsers;

    public UserServices() {
        this.listUsers = DataStorage.Users;
    }

    public boolean getUserBalance() {
        return true;
    }

    public boolean getAccountDetails() {
        return true;
    }

    public boolean updateAccDetails() {
        return true;
    }

    public void getTransactionHistory() {
    }

    public boolean deposit(double amount) {
        return true;
    }

    public double withdraw(int amount) {
        return 0.0;
    }
}
