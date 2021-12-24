package seventh;
import java.util.GregorianCalendar;
public class ninefive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar num=new GregorianCalendar();
		System.out.println(num.get(GregorianCalendar.YEAR));
		System.out.println(num.get(GregorianCalendar.MONTH)+1);
		System.out.println(num.get(GregorianCalendar.DAY_OF_MONTH));
		GregorianCalendar date=new GregorianCalendar();
		date.setTimeInMillis(1234567898765L);
		System.out.println(date.get(GregorianCalendar.YEAR));
		System.out.println(date.get(GregorianCalendar.MONTH)+1);
		System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));
	}


}
