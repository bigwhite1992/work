package third;
import java.util.HashMap;
import java.util.Scanner;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int number=input.nextInt();
		while(number!=0) {
			if(hashMap.containsKey(number)) {
				hashMap.put(number, hashMap.get(number) + 1);
			}
			else {
				hashMap.put(number, 1);
			}
			number=input.nextInt();
		}
		hashMap.forEach((value, times) -> System.out.println(value + " occurs " + times + ((times == 1) ? " time " : " times ")));
	}

}
