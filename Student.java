package Array_Practice;

//Run in notepad


public class Student {
	int id;
	String name;
	double per;
	Student(int id,String name,double per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	public String toString() {
		return "["+id+","+name+","+per+"]";
	}

	public static void main(String[] arg) {
		int id=Integer.parseInt(arg[0]);
		String name=arg[1];
		double per=Double.parseDouble(arg[2]);
		
		Student s=new Student(id,name,per);
		System.out.print(s);

	}

}
