package basicJava;

public class PreOperator3 {
	
	public static void main(String[] args) {
		
		// assignment operator
		int no;
		no = 10;
		System.out.println(no); //10
		System.out.println(++no);//11
		System.out.println("will see "+no); // will see
		System.out.println(no++ + ++no);
									//12  + 12
									//11 + 13
	}

}
