package tenth;
import java.util.Date;
public class Account {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private java.util.Date dateCreated;
	public Account() {
		dateCreated=new Date();
	}
	public Account(int id,double balance) {
		this.balance=balance;
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getAnnualInterestRate() {
		return this.annualInterestRate=annualInterestRate;
	}
	public void setAnnualInterestRate1(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	public Date getDateCreated() {
		return this.dateCreated;
	}
	public double getMonthlyInterestRate() {
		return this.annualInterestRate/12;
	}
	public double getMonthlyInterest() {
		return this.balance*(this.annualInterestRate/12);
	}
	public void withDraw(double drawmoney) {
		if(balance>=drawmoney)
			balance=balance-drawmoney;
	}
	public void deposit(double savemoney) {
		balance=balance+savemoney;
	}
}
