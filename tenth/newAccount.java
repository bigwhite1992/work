package tenth;
import java.util.ArrayList;
public class newAccount extends Account {
	private String name;
	private ArrayList<Transacation> transacations;
	public newAccount(String name,int id,double balance) {
		this.name=name;
		setId(id);
		setBalance(balance);
		this.transacations=new ArrayList<Transacation>();
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void Draw(double money) {
		withDraw(money);
		transacations.add(new Transacation('D',money,getBalance(),"交易成功"));
	}
	public void Deposit(double money) {
		deposit(money);
		transacations.add(new Transacation('W',money,getBalance(),"交易成功"));
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	newAccount account =new newAccount("George",1122,1000);
	account.setAnnualInterestRate1(1.5/100);
	account.Deposit(30.0);
	account.Deposit(40.0);
	account.Deposit(50.0);
	account.Draw(5.0);
	account.Draw(4.0);
	account.Draw(2.0);
	System.out.println(account.getName()+" "+account.getAnnualInterestRate()+" "+account.getBalance());
	System.out.println(account.transacations.toString());
}
}