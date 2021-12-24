package elventh;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class second {
static class student{
	private String index;
	private String name;
	private int age;
	public student(String index,String name,int age) {
		this.index=index;
		this.name=name;
		this.age=age;
	}
	public String getIndex() {
		return this.index;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void setIndex(String index) {
		this.index=index;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int compareTo(Object o) {
		if(!(o instanceof student)) {
			throw new RuntimeException("Error");
		}
		student p=(student)o;
		if(this.age>p.age) {
			return 1;
		}
		else if(this.age==p.age) {
			return this.name.compareTo(p.name);
		}
		else {
			return -1;
		}
	}
}
	public static void main(String[] args) throws FileNotFoundException {
		java.io.File file=new java.io.File("result.txt");
	    java.io.PrintWriter output=new java.io.PrintWriter(file);
		Scanner input=new Scanner(System.in);
		Set<student> students=new TreeSet<student>();
		while(true) {
			String index=input.next();
			if("exit".equals(index)) {
				break;
			}
			String name=input.next();
			int age=input.nextInt();
			student x=new student(index,name,age);
			students.add(x);
		}
			Iterator<student> it=students.iterator();
			while(it.hasNext()) {
				student stu=(student)it.next();
				output.println("name: "+stu.getName());
			}
		output.close();
	}

}
