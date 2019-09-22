package model;
//213553852

import javax.persistence.*;

@Entity(name="transaction_tbl")
public class TransactionEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int TransactionCode;
	private String name;
	private String sourcePassport;
	private String destinationBank;
	private String destinationCountry;
	private String accountNumber;
	private Double Amount;
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
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}
	
}
