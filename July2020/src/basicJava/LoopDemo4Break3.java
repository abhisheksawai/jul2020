package basicJava;
public class LoopDemo4Break3 {
	public static void main(String[] args) {
		
		int no;
		int no2;
		
		for(no=1;no<=5;no++)  //outer forloop row 5000
		{
			for(no2 =1 ; no2 <=3; no2++)  // inner forloop column 70
			{
				if(no2==2)
				continue;
				System.out.println("no1 is "+no+" | no2 is "+no2);
			}
		}
		
	}

}
