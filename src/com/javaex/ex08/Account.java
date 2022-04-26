package com.javaex.ex08;

public class Account {
	
	//필드
    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {}
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    //필요한 메소드 작성
    public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
    
    
    
    
    
    
    public void deposit(int deposit) {
		this.balance += deposit;
		
	}
	
	public void withdraw(int withdraw) {
		this.balance -= withdraw;
		
	}
	public void showBalance() {
		System.out.println(balance);
		
	}

}
