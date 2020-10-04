package polyMorphism;

public class Calculator {

	public void addition(int num1)  //1 argument
	{
		System.out.println(num1+num1);
	}
	
	public void addition(int num1)  //1 argument
	{
		System.out.println(num1+num1);
	}
	
	public void addition(int num1, int num2) // 2 argument
	{
		System.out.println(num1+num2);
	}
	
	public void addition(int num1,int num2, int num3) // 3 rgument
	{
		System.out.println(num1+num2+num3);
	}
	public void addition(double d)
	{
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.addition(10);
		c.addition(10,20);
		c.addition(4,1,1);
		c.addition(20.30);
		
		
	}
}
