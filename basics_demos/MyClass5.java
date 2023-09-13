public class MyClass5
{
	int num=100;
	void disp()
	{
		System.out.println(num);
	}
	void fun1(MyClass5 ref) // call by value
	{
		ref.num=200;
	}
	public static void main(String args[])
	{
		MyClass5 m1=new MyClass5();//instantiation of new object of class //MyClass5. Say, address=1000
			
		m1.disp();
		m1.fun1(m1);//passing the reference m1.

		m1.disp();

		
		
	}
}





