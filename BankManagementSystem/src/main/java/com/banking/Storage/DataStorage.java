//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.banking.Storage;

import com.banking.entity.Account;
import com.banking.entity.Transaction;
import com.banking.entity.User;
import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    public static List<User> Users = new ArrayList<User>();
    public static List<Transaction> transactions = new ArrayList<Transaction>();
    public static List<Account> accounts = new ArrayList<Account>();

    static {
        Users.add(new User(1, "Kunal", "12345", "8827182619", "kunal.rawal2@gmail.com"));
        Users.add(new User(2, "Kunal", "1234", "8827182618", "kunal.rawal23@gmail.com"));
        Users.add(new User(3, "Kunal", "123", "8827182617", "kunal.rawal24@gmail.com"));
        Users.add(new User(4, "Kunal", "12", "8827182616", "kunal.rawal26@gmail.com"));
        Users.add(new User(5, "Kunal", "1", "8827182615", "kunal.rawal29@gmail.com"));
        
        accounts.add(new Account(101, "1234-5678-9101-1121", "123", 40000.50, 1));
        accounts.add(new Account(102, "5677-5678-9101-1222", "767", 10000.70, 2));
        accounts.add(new Account(103, "8787-5678-9101-1313", "898", 15000.57, 3));
        accounts.add(new Account(104, "9090-5678-9101-1432", "123", 15334.50, 4));
        accounts.add(new Account(105, "1234-5678-9101-8756", "113", 15123.50, 5));
        
        transactions.add(new Transaction(111, "Deposit", 500.75, "Monthly savings","23-12-1999", 101));
        transactions.add(new Transaction(222, "Withdrawal", 500.75, "Monthly savings","23-12-1999", 102));
        transactions.add(new Transaction(333, "Deposit", 1500.75, "Monthly savings","23-12-1999", 103));
        transactions.add(new Transaction(444, "Withdrawal", 1000.75, "Monthly savings","23-12-1999", 104));
        transactions.add(new Transaction(555, "Deposit", 600.75, "Monthly savings","23-12-1999", 105));
        
    }

    public DataStorage() {
    }
}
