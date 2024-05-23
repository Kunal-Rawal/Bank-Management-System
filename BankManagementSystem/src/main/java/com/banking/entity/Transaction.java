//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.banking.entity;

public class Transaction {
    private int id;
    private String type;
    private double amount;
    private String notes;
    private String timestamp;
    private int accountId;

    public Transaction() {
    }
    
    public Transaction(int id, String type, double amount, String notes, String timestamp, int accountId) {
		super();
		this.id = id;
		this.type = type;
		this.amount = amount;
		this.notes = notes;
		this.timestamp = timestamp;
		this.accountId = accountId;
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

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
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
