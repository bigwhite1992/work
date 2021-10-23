package aa;

public class aa19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0,count=1;
      for (int i=101;i<=2100;i++) {
    	  if(count%10!=0) {
    	  if(i%400==0||(i%100!=0&&i%4==0)) {
    		  System.out.print(i+" ");
    		  total=total+1;
    		  count++;
    	  }
    	  }
    	  else {
        	  if(i%400==0||(i%100!=0&&i%4==0)) {
        		  System.out.println(i);
        		  total=total+1;
        		  count++; 
    	  }
    	  }
      }
      System.out.print("\n");
      System.out.println(total);
	}

}
