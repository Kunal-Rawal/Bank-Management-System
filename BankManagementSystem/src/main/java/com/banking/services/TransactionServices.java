package com.banking.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.banking.Storage.DataStorage;
import com.banking.entity.Transaction;

@Service
public class TransactionServices {

	private static List<Transaction> transactions;
	
	static {
		transactions = DataStorage.transactions;
	}
	
	public void addTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		transactions.add(transaction);
	}

	public List<Transaction> getAllTransactions() {
		// TODO Auto-generated method stub
		return transactions;
	}

	public List<Transaction> getTransactionById(int accountId) {
		// TODO Auto-generated method stub
		List<Transaction> transactionById = new ArrayList<Transaction>();
		for(int i=0;i<transactions.size();i++) {
			if(transactions.get(i).getAccountId() == accountId) {
				transactionById.add(transactions.get(i));
			}
		}
		return transactionById;
	}
	
}
