package basicJava;

public class IfDemo4 {
	
	public static void main(String[] args) {
		//if else ladder
		
		int marks = 96;
		
		if(marks <50)  // if condition is true then it will execute that block
		{
			System.out.println("Fail");
		}

	//	50-60 = d grade | 	60-70- c grade
		
		else if(marks >= 50 && marks < 60)
		{
			System.out.println("d grade");  
		}
		else if(marks >= 60 && marks < 70)
		{
			System.out.println("c grade");
		}
		
		else if(marks >= 80 || marks > 90)
		{
			System.out.println("or op grade");
		}
		
	}

}
