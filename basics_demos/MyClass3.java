public class MyClass3
{
	int num=100;
	void disp()
	{
		System.out.println(this.num);
	}
	public static void main(String args[])
	{
		MyClass3 m1=new MyClass3();instantiation of new object of class MyClass3. Say, address=1000
			
		m1.disp();
		m1=new MyClass3(); // instantiation of new object of class MyClass3.
//Say address=3000
		m1.disp();// calling disp() of  new object of class MyClass3 //instantiated in the above line, i.e; at addewss=3000

		new MyClass3().disp();//instantiation of new object of class //MyClass3. //Say, address=4000, calling disp() on this address.
		
	}
}





