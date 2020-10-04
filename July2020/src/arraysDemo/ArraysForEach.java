package arraysDemo;

public class ArraysForEach {
	
	public static void main(String[] args) {

	//student s = new student();
	 int        a[] =   new int[3];
	 
	 a[0] = 10;
	 a[1] = 220;
	 a[2] = 302;
	 
	 int aLenght=a.length;
	 
	 for(int i = 0 ; i< aLenght; i ++)
	 {
		 System.out.println("after ading lenght var ->> "+a[i]);
	 }
	 
	 //for(datatype newvariable: arrayvariable) { some code }  
	 
	 for (int d : a)  // Enhanced for loop
	 {
		 System.out.println("i am prinitn d here "+d);
	 }
		
	}

}
