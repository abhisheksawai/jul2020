package keyWordsDemo;

public class TestStaticVar {
	
	public static void main(String[] args) {
		
		StaticVariableCounter2 d = new StaticVariableCounter2();
		System.out.println("printing "+d.counter);
		
		
		System.out.println("calling static variable as -> StaticVariableCounter2.counter "+StaticVariableCounter2.counter);
		
		StaticMethod sm = new StaticMethod();
		sm.s1();  // instance variable
		sm.s2(); // static variable
		
		StaticMethod.s2();  // how to call static method , classname.staticmethodname - recommended way
		
		
		
	}

}
