//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.banking.entity;

public class Account {
    private int id;
    private String cardNumber;
    private String cvv;
    private double balance;
    private int userId;

    public Account() {
    }

    
    public Account(int id, String cardNumber, String cvv, double balance, int userId) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.balance = balance;
		this.userId = userId;
	}


	public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return this.cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Account{id=" + this.id + ", cardNumber='" + this.cardNumber + "', cvv='" + this.cvv + "', balance=" + this.balance + ", userId=" + this.userId + "}";
    }
}
