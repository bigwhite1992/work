package aa;

public class aa14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for (int i=0;i<8;i++) {
    	   for(int j=1;j<=15;j++) {
    		   if(j<8-i||j>8+i)
    			   System.out.print("    ");
    		   else if(j<8&&j>=8-i)
    			   System.out.print(String.format("%4.0f", Math.pow(2, j-8+i)));
    		   else if(j<=8+i&&j>=8)
    			   System.out.print(String.format("%4.0f", Math.pow(2,8-j+i)));
    	   }
    	   System.out.print("\n");
       }
	}

}
