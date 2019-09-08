package edu.sbcc.cs105;

import java.util.*;

public class BankAccount {

	private int balance;
	private String name;
	private double interestRate;
	private Date lastPostDate;

	public BankAccount(String name, int initialBalance, double interestRate, Date lastPostDate) {

		this.setName(name);
		this.balance = initialBalance;
		this.setInterestRate(interestRate);
		this.setLastPostDate(lastPostDate);
	}

	public Date getLastPostDate() {
		return lastPostDate;
	}

	public void setLastPostDate(Date lastPostDate) {
		this.lastPostDate = lastPostDate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void credit(double amount) throws IllegalArgumentException {

		if (amount < 0) {
			throw new IllegalArgumentException("Transaction would create a negative amount");
		}
		balance += amount;

	}

}
