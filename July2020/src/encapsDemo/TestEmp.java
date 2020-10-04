package encapsDemo;

public class TestEmp {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setEmpName("Mahesh");
		String getEmpN;
		
		getEmpN = e.getEmpName();
		System.out.println("im printing getEmpN "+getEmpN);
		//e.empName="abhishek";
		
	}

}
