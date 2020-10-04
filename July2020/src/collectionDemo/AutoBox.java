package collectionDemo;

public class AutoBox {
	
	public static void main(String[] args) {
		
		int a = 20;  //primitive type
		int d = 230;
		Integer b = 30;  // wrapper class
		
		System.out.println(a);
		System.out.println(b);
		
		 a=b; //c omplie time rr  | autoboxing
		 b=a;
		System.out.println(a);

		
		Integer i=Integer.valueOf(d); //converting int into Integer   when verion java was 1.5
		System.out.println(i);
		
	}

}
