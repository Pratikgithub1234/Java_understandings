public class MyClass4
{
	int num=100;
	void disp()
	{
		System.out.println(num);
	}
	void fun1(int k)
	{
		k=200;
	}
	public static void main(String args[])
	{
		MyClass4 m1=new MyClass4();//instantiation of new object of class //MyClass4. Say, address=1000
			
		m1.disp();
		m1.fun1(m1.num);// calling num of the object referenced by m1, and //passing the value to fun1();


		m1.disp();

		
		
	}
}





