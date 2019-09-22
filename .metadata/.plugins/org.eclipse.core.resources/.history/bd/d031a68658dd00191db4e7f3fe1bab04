package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "transaction")
@SessionScoped
public class Transaction {
	private int TransactionCode;
	private String name;
	private String sourcePassport;
	private String destinationBank;
	private String destinationCountry;
	private String accountNumber;
	private Double amount;
	
	
	public int getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(int transactionCode) {
		TransactionCode = transactionCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public TransactionEntity getEntity() {
		TransactionEntity transactionEntity =  new TransactionEntity();
		
		transactionEntity.setName(name);
		transactionEntity.setDestinationCountry(destinationCountry);
		transactionEntity.setDestinationBank(destinationBank);
		transactionEntity.setSourcePassport(sourcePassport);
		transactionEntity.setAmount(amount);
		transactionEntity.setAccountNumber(accountNumber);
		
		return transactionEntity;
	}
	
}
