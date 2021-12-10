package tenth;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Transacation {
	private Date date;
	private double amount;
	private double balance;
	private String description;
	private char type;
	Transacation (char type,double amount,double balance,String description){
		this.amount=amount;
		this.type=type;
		this.balance=balance;
		this.description=description;
		date=new Date();
	}
	public char getType() {
		return this.type;
	}
	public double getAmount() {
		return this.amount;
	}
	public Date getDate() {
		return this.date;
	}
	public double gatBalance() {
		return this.balance;
	}
	@Override
	public String toString() {
		return "交易记录： "+new SimpleDateFormat("yyyy-MM-dd").format(date)+" "+type+" "+amount+" "+balance+" 美元 "+description;
	}
}
