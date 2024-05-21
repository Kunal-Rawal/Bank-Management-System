//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.banking.entity;

import java.util.Date;

public class Transaction {
    private int id;
    private String type;
    private double amount;
    private String notes;
    private Date timestamp;
    private int accountId;

    public Transaction() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String toString() {
        int var10000 = this.id;
        return "Transaction{id=" + var10000 + ", type='" + this.type + "', amount=" + this.amount + ", notes='" + this.notes + "', timestamp=" + String.valueOf(this.timestamp) + ", accountId=" + this.accountId + "}";
    }
}
