package encapsDemo;

public class TestEmpRead {
	
	public static void main(String[] args) {
		
		EmpReadOnly er = new EmpReadOnly();
		String princName;
		
		princName = er.getprincipal();
		System.out.println("princ pname is "+princName);
		
	//	er.principalName = "abc";
	//	System.out.println("princ abc pname is "+er.principalName);
	}

}
