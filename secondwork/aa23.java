package aa;

public class aa23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i=1;i<=10000;i++) {
        	int total=0;
        	for (int j=1;j<=i/2+1;j++) {
        		if(i%j==0&&i!=j) {
        			total=total+j;
        		}
        	}
        	if(total==i) {
        		System.out.println(i);
        	}
        }
	}

}
