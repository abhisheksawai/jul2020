package polyMorphism;

public class MainOverloadDemo {
	
	public static void main() {
		System.out.println("Main - NO args"); 
		}
	
	public static void main(String args) {
		System.out.println("Main - String args");  
		}
	
	public static void main(String[] args) {
		System.out.println("Main - (String[] args)"); 
		
	MainOverloadDemo m = new MainOverloadDemo();
	m.main();
	m.main("abhishek");
		
		}
	

}
