package seventh;
import java.util.Random;
public class ninesix {

	public static void main(String[] args) {
		int[] array = new int[100000];
		StopWatch num=new StopWatch();
		Random ran=new Random();
		for(int i=0;i<100000;i++)
			array[i]=ran.nextInt();
		num.start();
		for(int i=0;i<array.length;i++) {
			int index=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[index])
					index=j;
			}
			int temp=array[i];
			array[i]=array[index];
			array[index]=temp;
		}
		num.end();
		System.out.println(num.getElapsedTime());
	}

}
