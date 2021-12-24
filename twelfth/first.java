package elventh;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class first {
	static class information{
		private String index;
		private int price;
		private String name;
		private String publish;
		public information(String index,String name,int price,String publish) {
			this.index=index;
			this.name=name;
			this.price=price;
			this.publish=publish;
		}
		public String getIndex() {
			return this.index;
		}
		public String getName() {
			return this.name;
		}
		public int getPrice() {
			return this.price;
		}
		public String getPublish() {
			return this.publish;
		}
		public void setIndex(String index) {
			this.index=index;
		}
		public void setName(String name) {
			this.name=name;
		}
		public void setPrice(int price) {
			this.price=price;
		}
		public void setPublish(String publish) {
			this.publish=publish;
		}
	}


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		List<information> books=new ArrayList<information>();
		Map<String,information> books1=new HashMap<String,information>();
		System.out.print("Enter a number of books: ");
		int n=input.nextInt();
		for(int i=0;i<n;i++) {
			String name,publish,index;
			int price;
			index=input.next();
			name=input.next();
			price=input.nextInt();
			publish=input.next();
			information mew=new information(index,name,price,publish);
			books.add(mew);
			books1.put(index, mew);
		}
		Iterator it=books.iterator();
		while(it.hasNext()) {
			information gulf=(information) it.next();
			System.out.println(gulf.getName());
		}
		Iterator it1=books1.entrySet().iterator();
		while(it1.hasNext()) {
			Map.Entry entry=(Map.Entry)it1.next();
			System.out.println("next: "+entry.getKey()+" "+((information)entry.getValue()).getName());
		}
	}

}
