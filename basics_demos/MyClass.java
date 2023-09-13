public class MyClass
{
	int num=100;
	void disp()
	{
		System.out.println(this.num);
	}
	void accept(int num)
	{
		this.num=num;// 'this' refers to the current invoking object, so the //num of current invoking object will be modified.
	}
	public static void main(String args[])
	{
		MyClass m1=new MyClass();// instantiation of class with reference m1
		MyClass m2=new MyClass();// instantiation of class with reference m2
		

		System.out.println(m1.num+"\t"+m2.num);
		

		m1.disp();//for displaying the values, calling disp() function.
		m2.disp();//for displaying the values, calling disp() function.

		m1.accept(300);// calling the accept() method on the reference m1. //modifying the value of num updating it to 300.
		
		m1.disp();//for displaying the values, calling disp() function.
		m2.disp();//for displaying the values, calling disp() function.
	}
}