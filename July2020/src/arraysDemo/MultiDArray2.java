package arraysDemo;

public class MultiDArray2 {
	
	public static void main(String[] args) {
		
		int c[][] = {{10,20,30},{21,32,43},{54,56,76}};
		
		for(int i = 0 ;i < 3 ; i ++)  //row travel
		{
			for(int j=0 ; j <3 ;j ++) // col
			{
				System.out.println("will print index now "+i +" "+ j);
				System.out.println("print mul array--> "+c[i][j]);
			}
		}
		
	}

}
